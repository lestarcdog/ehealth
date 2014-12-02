package hu.bme.aut.diploma.test;

import hu.bme.aut.diploma.main.HealthUserGroupCallback;
import hu.bme.aut.diploma.model.Diagnosis;
import hu.bme.aut.diploma.model.Measurement;
import hu.bme.aut.diploma.model.Person;

import java.util.LinkedList;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.manager.RuntimeEngine;
import org.kie.api.runtime.manager.RuntimeEnvironmentBuilder;
import org.kie.api.runtime.manager.RuntimeManager;
import org.kie.api.runtime.manager.RuntimeManagerFactory;
import org.kie.api.task.TaskService;
import org.kie.internal.runtime.manager.context.EmptyContext;

import bitronix.tm.resource.jdbc.PoolingDataSource;

public class HealthRuleTest {
	
	KieSession session;
	TaskService ts;
	private RuntimeManager manager;
	private RuntimeEngine engine;
	private Person patient;
	
	private static void initDataSource() {
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
	}
	
//	@BeforeClass
//	public void beforeTest() throws Exception {
//		patient = new Person();
//		patient.setName("Vén József");
//		patient.setSsn("0123456789");
//		patient.setDiagnosis(new LinkedList<Diagnosis>());
//		patient.setMeasurements(new LinkedList<Measurement>());
//	}

	@Before
	public void setUp() throws Exception {
		RuntimeEnvironmentBuilder runenv = RuntimeEnvironmentBuilder.Factory
				.get().newClasspathKmoduleDefaultBuilder("healthKB",
						"health-session");
		runenv.persistence(false);
		initDataSource();
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("healthPU");
		runenv.entityManagerFactory(emf);
		runenv.userGroupCallback(new HealthUserGroupCallback());
		manager = RuntimeManagerFactory.Factory.get()
				.newSingletonRuntimeManager(runenv.get());
		engine = manager.getRuntimeEngine(EmptyContext.get());
		 session = engine.getKieSession();
		 ts = engine.getTaskService();
	}

	@Test
	public void test() {
		System.out.println("futottam");
	}
	
	

}
