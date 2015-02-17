package hu.bme.aut.diploma.main;

import java.util.Collections;
import java.util.List;

import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.process.ProcessContext;
import org.kie.api.task.TaskService;
import org.kie.api.task.model.TaskSummary;

public class PatientQuizService {
	
	private static TaskService ts;
	
	public static void setTaskService(TaskService ts) {
		PatientQuizService.ts = ts;
	}

	public static Long initQuizForUser(String patientid, String quizid) {
		System.out.println("User: "+patientid+", quizid: "+quizid);
		List<TaskSummary> list = ts.getTasksAssignedAsPotentialOwner(patientid, "hu");
		System.out.println("#TaskSummary: "+list.size());
		if(list.size() > 0 ){
			TaskSummary quiz = list.get(0);
			ts.start(quiz.getId(), patientid);
			//hivjal meg mas servicet is ami
			ts.complete(quiz.getId(), patientid, null);
			return quiz.getId();
		}	
		return null;
	}
	
	
	public static void completeQuizForUser(long taskid,String patientid) {
		ts.complete(taskid, patientid, Collections.EMPTY_MAP);
	}
}
