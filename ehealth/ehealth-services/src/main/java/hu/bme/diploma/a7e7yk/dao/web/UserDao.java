package hu.bme.diploma.a7e7yk.dao.web;

import hu.bme.diploma.a7e7yk.datamodel.entity.WebUser;

import javax.ejb.Local;
import javax.ejb.Stateless;

@Local
@Stateless
public class UserDao extends CommonDao {

  public WebUser findWebUserByName(String username) {
    if (username.equals("jozsi")) {
      WebUser wu = new WebUser();
      wu.setUsername(username);
      wu.setPassword("jozsi");
      return wu;
    }
    return null;
  }
}
