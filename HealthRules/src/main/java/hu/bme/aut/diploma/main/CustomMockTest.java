package hu.bme.aut.diploma.main;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.naming.InitialContext;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.sql.DataSource;
import javax.transaction.Status;
import javax.transaction.UserTransaction;

import junit.framework.Assert;

import org.drools.core.audit.WorkingMemoryInMemoryLogger;
import org.drools.core.audit.event.LogEvent;
import org.drools.core.audit.event.RuleFlowNodeLogEvent;
import org.drools.persistence.jta.JtaTransactionManager;
import org.jbpm.process.instance.event.DefaultSignalManagerFactory;
import org.jbpm.process.instance.impl.DefaultProcessInstanceManagerFactory;
import org.jbpm.runtime.manager.impl.DefaultRegisterableItemsFactory;
import org.jbpm.runtime.manager.impl.SimpleRegisterableItemsFactory;
import org.jbpm.runtime.manager.impl.jpa.EntityManagerFactoryManager;
import org.jbpm.workflow.instance.impl.WorkflowProcessInstanceImpl;
import org.junit.After;
import org.junit.Before;
import org.kie.api.definition.process.Node;
import org.kie.api.event.process.ProcessEventListener;
import org.kie.api.event.rule.AgendaEventListener;
import org.kie.api.io.ResourceType;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.manager.Context;
import org.kie.api.runtime.manager.RuntimeEngine;
import org.kie.api.runtime.manager.RuntimeEnvironment;
import org.kie.api.runtime.manager.RuntimeEnvironmentBuilder;
import org.kie.api.runtime.manager.RuntimeManager;
import org.kie.api.runtime.manager.RuntimeManagerFactory;
import org.kie.api.runtime.manager.audit.AuditService;
import org.kie.api.runtime.manager.audit.NodeInstanceLog;
import org.kie.api.runtime.process.NodeInstance;
import org.kie.api.runtime.process.NodeInstanceContainer;
import org.kie.api.runtime.process.ProcessInstance;
import org.kie.api.runtime.process.WorkItem;
import org.kie.api.runtime.process.WorkItemHandler;
import org.kie.api.runtime.process.WorkItemManager;
import org.kie.api.runtime.process.WorkflowProcessInstance;
import org.kie.api.task.TaskLifeCycleEventListener;
import org.kie.internal.io.ResourceFactory;
import org.kie.internal.runtime.StatefulKnowledgeSession;
import org.kie.internal.runtime.manager.context.EmptyContext;

import bitronix.tm.resource.jdbc.PoolingDataSource;

/**
* Base test case class that shall be used for jBPM related tests. It provides four sections:
* <ul>
*  <li>JUnit life cycle methods</li>
*  <li>Knowledge Base and KnowledgeSession management methods</li>
*  <li>Assertions</li>
*  <li>Helper methods</li>
* </ul>
* <b>JUnit life cycle methods</b>:<br/>
* * setUp: executed @Before and configures data source and <code>EntityManagerFactory</code>, cleans up Singleton's session id<br/>
* * tearDown: executed @After and clears out history, closes <code>EntityManagerFactory</code> and data source, disposes <code>RuntimeEngine</code>'s and <code>RuntimeManager</code><br/>
* <br/>
* <b>KnowledgeBase and KnowledgeSession management methods</b>
* * createRuntimeManager creates <code>RuntimeManager</code> for gives set of assets and selected strategy 
* <br/>
* * disposeRuntimeManager disposes <code>RuntimeManager</code> currently active in the scope of test
* <br/>
* * getRuntimeEngine creates new <code>RuntimeEngine</code> for given context<br/>
* <br/>
* <b>Assertions</b><br/>
* Set of useful methods to assert process instance at various stages.
* <br/>
* <b>Helper methods</b><br/>
* * getDs - returns currently configured data source<br/>
* * getEmf - returns currently configured <code>EntityManagerFactory</code><br/>
* * getTestWorkItemHandler - returns test work item handler that might be registered in addition to what is registered by default<br/>
* * clearHistory - clears history log<br/>
* * setupPoolingDataSource - sets up data source<br/>
*/
public class CustomMockTest extends Assert {
   
   /**
    * Currently supported RuntimeEngine strategies
    */
   public enum Strategy {
       SINGLETON,
       REQUEST,
       PROCESS_INSTANCE;
   }
   
 
   protected boolean setupDataSource = false;
   protected boolean sessionPersistence = false;
   private String persistenceUnitName;
   
   private EntityManagerFactory emf;
   private PoolingDataSource ds;
   
   private TestWorkItemHandler workItemHandler = new TestWorkItemHandler();
   
   private RuntimeManagerFactory managerFactory = RuntimeManagerFactory.Factory.get();
   protected RuntimeManager manager;

   private AuditService logService;
   private WorkingMemoryInMemoryLogger inMemoryLogger;    
  
   protected Set<RuntimeEngine> activeEngines = new HashSet<RuntimeEngine>();
   
   protected Map<String, WorkItemHandler> customHandlers = new HashMap<String, WorkItemHandler>();
   protected List<ProcessEventListener> customProcessListeners = new ArrayList<ProcessEventListener>();
   protected List<AgendaEventListener> customAgendaListeners = new ArrayList<AgendaEventListener>();
   protected List<TaskLifeCycleEventListener> customTaskListeners = new ArrayList<TaskLifeCycleEventListener>();

   public CustomMockTest(boolean setupDataSource, boolean sessionPersistence, String persistenceUnitName) {
       this.setupDataSource = setupDataSource;
       this.sessionPersistence = sessionPersistence;
       this.persistenceUnitName = persistenceUnitName;
       if (!this.setupDataSource && this.sessionPersistence) {
           throw new IllegalArgumentException("Unsupported configuration, cannot enable sessionPersistence when setupDataSource is disabled");
       }
   }


   @Before
   public void setUp() throws Exception {

       if (setupDataSource) {
           ds = setupPoolingDataSource();
      
           emf = Persistence.createEntityManagerFactory(persistenceUnitName);
       }
       cleanupSingletonSessionId();
       
   }

   @After
   public void tearDown() throws Exception {
   	clearCustomRegistry();
       disposeRuntimeManager();
       clearHistory();
       if (setupDataSource) {
           if (emf != null) {
               emf.close();
               emf = null;                
              	EntityManagerFactoryManager.get().clear();
               
           }
           if (ds != null) {
               ds.close();
               ds = null;
           }
           try { 
               InitialContext context = new InitialContext();
               UserTransaction ut = (UserTransaction) context.lookup( JtaTransactionManager.DEFAULT_USER_TRANSACTION_NAME );
               if( ut.getStatus() != Status.STATUS_NO_TRANSACTION ) { 
                   ut.setRollbackOnly();
                   ut.rollback();
               }
           } catch( Exception e ) { 
               // do nothing
           }
       }        
   }

   /**
    * Creates default configuration of <code>RuntimeManager</code> with SINGLETON strategy and all 
    * <code>processes</code> being added to knowledge base.
    * <br/>
    * There should be only one <code>RuntimeManager</code> created during single test.
    * @param process - processes that shall be added to knowledge base
    * @return new instance of RuntimeManager
    */
   protected RuntimeManager createRuntimeManager(String... process) {
       return createRuntimeManager(Strategy.SINGLETON, null, process);
   }
   
   /**
    * Creates default configuration of <code>RuntimeManager</code> with given <code>strategy</code> and all 
    * <code>processes</code> being added to knowledge base.
    * <br/>
    * There should be only one <code>RuntimeManager</code> created during single test.
    * @param strategy - selected strategy of those that are supported
    * @param identifier - identifies the runtime manager
    * @param process - processes that shall be added to knowledge base
    * @return new instance of RuntimeManager
    */
   protected RuntimeManager createRuntimeManager(Strategy strategy, String identifier, String... process) {
       Map<String, ResourceType> resources = new HashMap<String, ResourceType>();
       for (String p : process) {
           resources.put(p, ResourceType.BPMN2);
       }
       return createRuntimeManager(strategy, resources, identifier);
   }

   /**
    * Creates default configuration of <code>RuntimeManager</code> with SINGLETON strategy and all 
    * <code>resources</code> being added to knowledge base.
    * <br/>
    * There should be only one <code>RuntimeManager</code> created during single test.
    * @param resources - resources (processes, rules, etc) that shall be added to knowledge base
    * @return new instance of RuntimeManager
    */
   protected RuntimeManager createRuntimeManager(Map<String, ResourceType> resources) {
       return createRuntimeManager(Strategy.SINGLETON, resources, null);
   }

   /**
    * Creates default configuration of <code>RuntimeManager</code> with SINGLETON strategy and all 
    * <code>resources</code> being added to knowledge base.
    * <br/>
    * There should be only one <code>RuntimeManager</code> created during single test.
    * @param resources - resources (processes, rules, etc) that shall be added to knowledge base
    * @param identifier - identifies the runtime manager
    * @return new instance of RuntimeManager
    */
   protected RuntimeManager createRuntimeManager(Map<String, ResourceType> resources, String identifier) {
       return createRuntimeManager(Strategy.SINGLETON, resources, identifier);
   }
   
   /**
    * Creates default configuration of <code>RuntimeManager</code> with given <code>strategy</code> and all 
    * <code>resources</code> being added to knowledge base.
    * <br/>
    * There should be only one <code>RuntimeManager</code> created during single test.
    * @param strategy - selected strategy of those that are supported
    * @param resources - resources that shall be added to knowledge base
    * @return new instance of RuntimeManager
    */
   protected RuntimeManager createRuntimeManager(Strategy strategy, Map<String, ResourceType> resources) {
       return createRuntimeManager(strategy, resources, null);
   }
   
   /**
    * Creates default configuration of <code>RuntimeManager</code> with given <code>strategy</code> and all 
    * <code>resources</code> being added to knowledge base.
    * <br/>
    * There should be only one <code>RuntimeManager</code> created during single test.
    * @param strategy - selected strategy of those that are supported
    * @param resources - resources that shall be added to knowledge base
    * @param identifier - identifies the runtime manager
    * @return new instance of RuntimeManager
    */
   protected RuntimeManager createRuntimeManager(Strategy strategy, Map<String, ResourceType> resources, String identifier) {
       if (manager != null) {
           throw new IllegalStateException("There is already one RuntimeManager active");
       }
       
       RuntimeEnvironmentBuilder builder = null;
       if (!setupDataSource){
           builder = RuntimeEnvironmentBuilder.Factory.get()
       			.newEmptyBuilder()
           .addConfiguration("drools.processSignalManagerFactory", DefaultSignalManagerFactory.class.getName())
           .addConfiguration("drools.processInstanceManagerFactory", DefaultProcessInstanceManagerFactory.class.getName())
           .registerableItemsFactory(new SimpleRegisterableItemsFactory() {

				@Override
				public Map<String, WorkItemHandler> getWorkItemHandlers(RuntimeEngine runtime) {
					Map<String, WorkItemHandler> handlers = new HashMap<String, WorkItemHandler>();
					handlers.putAll(super.getWorkItemHandlers(runtime));
					handlers.putAll(customHandlers);
					return handlers;
				}
	
				@Override
				public List<ProcessEventListener> getProcessEventListeners(RuntimeEngine runtime) {
					List<ProcessEventListener> listeners = super.getProcessEventListeners(runtime);
					listeners.addAll(customProcessListeners);
					return listeners;
				}
	
				@Override
				public List<AgendaEventListener> getAgendaEventListeners( RuntimeEngine runtime) {
					List<AgendaEventListener> listeners = super.getAgendaEventListeners(runtime);
					listeners.addAll(customAgendaListeners);
					return listeners;
				}
	
				@Override
				public List<TaskLifeCycleEventListener> getTaskListeners() {
					List<TaskLifeCycleEventListener> listeners = super.getTaskListeners();
					listeners.addAll(customTaskListeners);
					return listeners;
				}
	        	
	        });
           
       } else if (sessionPersistence) {
           builder = RuntimeEnvironmentBuilder.Factory.get()
       			.newDefaultBuilder()
           .entityManagerFactory(emf)
           .registerableItemsFactory(new DefaultRegisterableItemsFactory() {
        	   
        	   

				@Override
				public Map<String, WorkItemHandler> getWorkItemHandlers(RuntimeEngine runtime) {
					Map<String, WorkItemHandler> handlers = new HashMap<String, WorkItemHandler>();
					handlers.putAll(super.getWorkItemHandlers(runtime));
					handlers.putAll(customHandlers);
					return handlers;
				}
	
				@Override
				public List<ProcessEventListener> getProcessEventListeners(RuntimeEngine runtime) {
					List<ProcessEventListener> listeners = super.getProcessEventListeners(runtime);
					listeners.addAll(customProcessListeners);
					return listeners;
				}
	
				@Override
				public List<AgendaEventListener> getAgendaEventListeners( RuntimeEngine runtime) {
					List<AgendaEventListener> listeners = super.getAgendaEventListeners(runtime);
					listeners.addAll(customAgendaListeners);
					return listeners;
				}
	
				@Override
				public List<TaskLifeCycleEventListener> getTaskListeners() {
					List<TaskLifeCycleEventListener> listeners = super.getTaskListeners();
					listeners.addAll(customTaskListeners);
					return listeners;
				}
	        	
	        });
       } else {
           builder = RuntimeEnvironmentBuilder.Factory.get()
       			.newDefaultInMemoryBuilder()
       			.registerableItemsFactory(new DefaultRegisterableItemsFactory() {

				@Override
				public Map<String, WorkItemHandler> getWorkItemHandlers(RuntimeEngine runtime) {
					Map<String, WorkItemHandler> handlers = new HashMap<String, WorkItemHandler>();
					handlers.putAll(super.getWorkItemHandlers(runtime));
					handlers.putAll(customHandlers);
					return handlers;
				}
	
				@Override
				public List<ProcessEventListener> getProcessEventListeners(RuntimeEngine runtime) {
					List<ProcessEventListener> listeners = super.getProcessEventListeners(runtime);
					listeners.addAll(customProcessListeners);
					return listeners;
				}
	
				@Override
				public List<AgendaEventListener> getAgendaEventListeners( RuntimeEngine runtime) {
					List<AgendaEventListener> listeners = super.getAgendaEventListeners(runtime);
					listeners.addAll(customAgendaListeners);
					return listeners;
				}
	
				@Override
				public List<TaskLifeCycleEventListener> getTaskListeners() {
					List<TaskLifeCycleEventListener> listeners = super.getTaskListeners();
					listeners.addAll(customTaskListeners);
					return listeners;
				}
	        	
	        });       
       }
       builder.userGroupCallback(new HealthUserGroupCallback());
       
       for (Map.Entry<String, ResourceType> entry : resources.entrySet()) {            
           builder.addAsset(ResourceFactory.newClassPathResource(entry.getKey()), entry.getValue());
       }
       
       return createRuntimeManager(strategy, resources, builder.get(), identifier);
   }
   
   /**
    * The lowest level of creation of <code>RuntimeManager</code> that expects to get <code>RuntimeEnvironment</code>
    * to be given as argument. It does not assume any particular configuration as it's considered manual creation
    * that allows to configure every single piece of <code>RuntimeManager</code>. <br/>
    * Use this only when you know what you do!
    * @param strategy - selected strategy of those that are supported
    * @param resources - resources that shall be added to knowledge base 
    * @param environment - runtime environment used for <code>RuntimeManager</code> creation
    * @param identifier - identifies the runtime manager
    * @return new instance of RuntimeManager
    */
   protected RuntimeManager createRuntimeManager(Strategy strategy, Map<String, ResourceType> resources, RuntimeEnvironment environment, String identifier) {
       if (manager != null) {
           throw new IllegalStateException("There is already one RuntimeManager active");
       }

       switch (strategy) {
       case SINGLETON:
           if (identifier == null) {
               manager = managerFactory.newSingletonRuntimeManager(environment);
           } else {
               manager = managerFactory.newSingletonRuntimeManager(environment, identifier);
           }
           break;
       case REQUEST:
           if (identifier == null) {
               manager = managerFactory.newPerRequestRuntimeManager(environment);   
           } else {  
               manager = managerFactory.newPerRequestRuntimeManager(environment, identifier);
           }
           break;
       case PROCESS_INSTANCE:
           if (identifier == null) {
               manager = managerFactory.newPerProcessInstanceRuntimeManager(environment);
           } else {
               manager = managerFactory.newPerProcessInstanceRuntimeManager(environment, identifier);
           }
           break;
       default:
           if (identifier == null) {
               manager = managerFactory.newSingletonRuntimeManager(environment);
           } else {
               manager = managerFactory.newSingletonRuntimeManager(environment, identifier);
           }
           break;
       }
        
       return manager;
   }

   /**
    * Disposes currently active (in scope of a test) <code>RuntimeManager</code> together with all
    * active <code>RuntimeEngine</code>'s that were created (in scope of a test). Usual use case is 
    * to simulate system shutdown.
    */
   protected void disposeRuntimeManager() {
       if (!activeEngines.isEmpty()) {
           for (RuntimeEngine engine : activeEngines) {
           	try {
           		manager.disposeRuntimeEngine(engine);
           	} catch (Exception e) {
           		
           	}
           }
           activeEngines.clear();
       }
       if (manager != null) {
           manager.close();
           manager = null;
       }
   }

   /**
    * Returns new <code>RuntimeEngine</code> built from the manager of this test case.
    * It uses <code>EmptyContext</code> that is suitable for following strategies:
    * <ul>
    *  <li>Singleton</li>
    *  <li>Request</li>
    * </ul>
    * @see #getRuntimeEngine(Context)
    * @return new RuntimeEngine instance
    */
   protected RuntimeEngine getRuntimeEngine() {
       return getRuntimeEngine(EmptyContext.get());
   }
   
   /**
    * Returns new <code>RuntimeEngine</code> built from the manager of this test case. Common use case is to maintain 
    * same session for process instance and thus <code>ProcessInstanceIdContext</code> shall be used.
    * @param context - instance of the context that shall be used to create <code>RuntimeManager</code>
    * @return new RuntimeEngine instance
    */
   protected RuntimeEngine getRuntimeEngine(Context<?> context) {
       if (manager == null) {
           throw new IllegalStateException("RuntimeManager is not initialized, did you forgot to create it?");
       }
        
       RuntimeEngine runtimeEngine = manager.getRuntimeEngine(context);
       activeEngines.add(runtimeEngine);
       if (sessionPersistence) {            
           //logService = runtimeEngine.getAuditService();               
           
       } else {            
           inMemoryLogger = new WorkingMemoryInMemoryLogger((StatefulKnowledgeSession) runtimeEngine.getKieSession());
       }
       
       return runtimeEngine;
   }

   /**
    * Retrieves value of the variable given by <code>name</code> from process instance given by <code>processInstanceId</code>
    * using given session.
    * @param name - name of the variable
    * @param processInstanceId - id of process instance
    * @param ksession - ksession used to retrieve the value
    * @return returns variable value or null if there is no such variable
    */
   public Object getVariableValue(String name, long processInstanceId, KieSession ksession) {
       return ((WorkflowProcessInstance) ksession.getProcessInstance(processInstanceId)).getVariable(name);
   }

   /*
    * ****************************************
    * *********** helper methods *************
    * ****************************************
    */
   
   protected EntityManagerFactory getEmf() {
       return this.emf;
   }
   
   protected DataSource getDs() {
       return this.ds;
   }

   protected PoolingDataSource setupPoolingDataSource() {
       PoolingDataSource pds = new PoolingDataSource();
       pds.setUniqueName("jdbc/jbpm-ds");
       pds.setClassName("bitronix.tm.resource.jdbc.lrc.LrcXADataSource");
       pds.setMaxPoolSize(5);
       pds.setAllowLocalTransactions(true);
       pds.getDriverProperties().put("user", "root");
       pds.getDriverProperties().put("password", "toor");
       pds.getDriverProperties().put("url", "jdbc:mysql://localhost:3306/ehealth");
       pds.getDriverProperties().put("driverClassName", "com.mysql.jdbc.Driver");
       pds.init();
       return pds;
   }
   
   protected void clearHistory() {
       if (sessionPersistence && logService != null) {
       	RuntimeManager manager = createRuntimeManager();
       	RuntimeEngine engine = manager.getRuntimeEngine(null);
       	//engine.getAuditService().clear();
       	manager.disposeRuntimeEngine(engine);
       	manager.close();
       } else if (inMemoryLogger != null) {
           inMemoryLogger.clear();
       }
   }
   
   protected void clearCustomRegistry() {
   	this.customAgendaListeners.clear();
   	this.customHandlers.clear();
   	this.customProcessListeners.clear();
   	this.customTaskListeners.clear();
   }
   
   
   protected TestWorkItemHandler getTestWorkItemHandler() {
       return workItemHandler;
   }
   
   protected AuditService getLogService() {
       return logService;
   }
   
   protected WorkingMemoryInMemoryLogger getInMemoryLogger() {
       return inMemoryLogger;
   }
   
   public void addProcessEventListener(ProcessEventListener listener) {
   	customProcessListeners.add(listener);
   }
   
   public void addAgendaEventListener(AgendaEventListener listener) {
   	customAgendaListeners.add(listener);
   }
   
   public void addTaskEventListener(TaskLifeCycleEventListener listener) {
   	customTaskListeners.add(listener);
   }
   
   public void addWorkItemHandler(String name, WorkItemHandler handler) {
   	customHandlers.put(name, handler);
   }

   protected static class TestWorkItemHandler implements WorkItemHandler {

       private List<WorkItem> workItems = new ArrayList<WorkItem>();

       public void executeWorkItem(WorkItem workItem, WorkItemManager manager) {
           workItems.add(workItem);
       }

       public void abortWorkItem(WorkItem workItem, WorkItemManager manager) {
       }

       public WorkItem getWorkItem() {
           if (workItems.size() == 0) {
               return null;
           }
           if (workItems.size() == 1) {
               WorkItem result = workItems.get(0);
               this.workItems.clear();
               return result;
           } else {
               throw new IllegalArgumentException("More than one work item active");
           }
       }

       public List<WorkItem> getWorkItems() {
           List<WorkItem> result = new ArrayList<WorkItem>(workItems);
           workItems.clear();
           return result;
       }
   }

   protected static void cleanupSingletonSessionId() {
       File tempDir = new File(System.getProperty("java.io.tmpdir"));
       if (tempDir.exists()) {
           
           String[] jbpmSerFiles = tempDir.list(new FilenameFilter() {
               
               @Override
               public boolean accept(File dir, String name) {
                   
                   return name.endsWith("-jbpmSessionId.ser");
               }
           });
           for (String file : jbpmSerFiles) {
               
               new File(tempDir, file).delete();
           }
       }
   }
}

