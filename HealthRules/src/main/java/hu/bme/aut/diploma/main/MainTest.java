package hu.bme.aut.diploma.main;

import hu.bme.aut.diploma.model.Diagnosis;
import hu.bme.aut.diploma.model.Measurement;
import hu.bme.aut.diploma.model.Person;

import java.util.LinkedList;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.kie.api.event.process.ProcessCompletedEvent;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.manager.RuntimeEngine;
import org.kie.api.runtime.manager.RuntimeEnvironmentBuilder;
import org.kie.api.runtime.manager.RuntimeManager;
import org.kie.api.runtime.manager.RuntimeManagerFactory;
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
		
		session.addEventListener(new org.kie.api.event.process.DefaultProcessEventListener() {
			@Override
			public void afterProcessCompleted(ProcessCompletedEvent event) {
				event.getKieRuntime().halt();
			}});

		
		createPatient();

		
		Thread t = new Thread() {
			  public void run() {
			    session.fireUntilHalt();
			}};
		t.start();
		
		session.insert(patient);
		session.startProcess("rules.HearthFailure");
		
		

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
		
		Diagnosis apneaatrest= new Diagnosis();
		apneaatrest.setHumanname("Dyspnea at rest");
		apneaatrest.setSnomedcode("161941007");
		
		patient.getDiagnosis().add(apneaatrest);
		
//   		Diagnosis highbp = new Diagnosis();
//   		highbp.setSnomedcode("38341003");
//   		highbp.setHumanname("Hypertensive disorder, systemic arterial");
//   		patient.getDiagnosis().add(highbp);
		
		Measurement sys = new Measurement();
		sys.setValue(80.0);
		sys.setType("111973004");
		
		Measurement dias = new Measurement();
		dias.setValue(80.0);
		dias.setType("90892000");
		

		
		patient.getMeasurements().add(sys);
		patient.getMeasurements().add(dias);

	}

}
