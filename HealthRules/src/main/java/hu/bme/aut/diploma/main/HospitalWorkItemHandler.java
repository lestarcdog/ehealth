package hu.bme.aut.diploma.main;

import java.util.HashMap;
import java.util.Map;

import org.kie.api.runtime.process.WorkItem;
import org.kie.api.runtime.process.WorkItemHandler;
import org.kie.api.runtime.process.WorkItemManager;

public class HospitalWorkItemHandler implements WorkItemHandler {

	@Override
	public void abortWorkItem(WorkItem item, WorkItemManager mgr) {

		
	}

	@Override
	public void executeWorkItem(WorkItem item, WorkItemManager mgr) {
		System.out.println("Communicating with the hospital");
		Map<String,Object> output = new HashMap<String, Object>();
		output.put("infarct", Boolean.FALSE);
		mgr.completeWorkItem(item.getId(), output);
		
	}

}
