package hu.bme.aut.diploma.main;

import hu.bme.aut.diploma.model.Diagnosis;
import hu.bme.aut.diploma.model.Measurement;
import hu.bme.aut.diploma.model.Person;
import hu.bme.aut.diploma.util.DiagnosisUtil;
import hu.bme.aut.diploma.util.MeasurementUtil;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.kie.api.event.process.ProcessCompletedEvent;
import org.kie.api.event.rule.DefaultAgendaEventListener;
import org.kie.api.event.rule.MatchCreatedEvent;
import org.kie.api.event.rule.RuleFlowGroupActivatedEvent;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.manager.RuntimeEngine;
import org.kie.api.runtime.manager.RuntimeEnvironmentBuilder;
import org.kie.api.runtime.manager.RuntimeManager;
import org.kie.api.runtime.manager.RuntimeManagerFactory;
import org.kie.api.runtime.process.ProcessInstance;
import org.kie.api.runtime.process.WorkflowProcessInstance;
import org.kie.api.task.TaskService;
import org.kie.internal.runtime.manager.context.EmptyContext;

import bitronix.tm.resource.jdbc.PoolingDataSource;

public class MainTest  {

	static Person patient;
	private static PoolingDataSource pds;

	private static void initDataSource() {
		pds = new PoolingDataSource();
		pds.setUniqueName("jdbc/jbpm-ds");
		pds.setClassName("bitronix.tm.resource.jdbc.lrc.LrcXADataSource");
		pds.setMaxPoolSize(5);
		pds.setAllowLocalTransactions(true);
		pds.getDriverProperties().put("user", "root");
		pds.getDriverProperties().put("password", "toor");
		pds.getDriverProperties().put("url",
				"jdbc:mysql://localhost:3306/ehealth");
		pds.getDriverProperties().put("driverClassName",
				"com.mysql.jdbc.Driver");
		pds.init();
	}

	public static void main(String[] args) {
		RuntimeEnvironmentBuilder runenv = RuntimeEnvironmentBuilder.Factory
				.get().newClasspathKmoduleDefaultBuilder("healthKB",
						"health-session");
		runenv.persistence(false);

		initDataSource();

		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("healthPU");
		runenv.entityManagerFactory(emf);
		runenv.userGroupCallback(new HealthUserGroupCallback());
		RuntimeManager manager = RuntimeManagerFactory.Factory.get()
				.newSingletonRuntimeManager(runenv.get());
		RuntimeEngine engine = manager.getRuntimeEngine(EmptyContext.get());
		final KieSession session = engine.getKieSession();
		TaskService ts = engine.getTaskService();
		
		session.addEventListener(new DefaultAgendaEventListener() {
			@Override
			public void afterRuleFlowGroupActivated(RuleFlowGroupActivatedEvent event) {
				KieSession kses = (KieSession) event.getKieRuntime();
				kses.fireAllRules();
			}
			@Override
			public void matchCreated(MatchCreatedEvent event) {
				KieSession kses = (KieSession) event.getKieRuntime();
				kses.fireAllRules();
			}
		});

		
		createPatient();
		
		Map<String,Object> params = new HashMap<String, Object>();
		params.put("RedFlag", new Boolean(false));
																													
		WorkflowProcessInstance hearthfailureProcess =  (WorkflowProcessInstance) session.createProcessInstance("rules.HearthFailure", params);
		session.insert(hearthfailureProcess);
		session.insert(patient);
		session.startProcessInstance(hearthfailureProcess.getId());
	

		// // fun endds here
//		t.stop();
//		manager.disposeRuntimeEngine(engine);
//		manager.close();
//		emf.close();
//		pds.close();
	}

	private static void createPatient() {
		patient = new Person();
		patient.setName("Vén József");
		patient.setSsn("0123456789");
		patient.setDiagnosis(new LinkedList<Diagnosis>());
		patient.setMeasurements(new LinkedList<Measurement>());
		
		DiagnosisUtil.insertDiagnosis(patient, "161941007", "Dyspnea at rest");
		MeasurementUtil.insertMeasurement(patient, "111973004", 160.0);
		MeasurementUtil.insertMeasurement(patient, "90892000", 80.0);
		

	}

}
