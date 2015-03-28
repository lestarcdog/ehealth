package hu.bme.aut.diploma.main;

import java.util.List;

import org.kie.api.task.UserGroupCallback;

public class HealthUserGroupCallback implements UserGroupCallback {

	@Override
	public boolean existsGroup(String arg0) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean existsUser(String arg0) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public List<String> getGroupsForUser(String arg0, List<String> arg1,
			List<String> arg2) {
		// TODO Auto-generated method stub
		return null;
	}

}
