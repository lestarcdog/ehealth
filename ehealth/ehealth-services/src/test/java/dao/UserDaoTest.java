package dao;

import hu.bme.diploma.a7e7yk.dao.web.UserDao;
import hu.bme.diploma.a7e7yk.datamodel.entity.WebUser;
import hu.bme.diploma.a7e7yk.datamodel.enums.WebUserGroupEnum;
import hu.bme.diploma.a7e7yk.exceptions.EhealthException;

import javax.ejb.EJB;

import org.junit.Assert;
import org.junit.Test;

public class UserDaoTest extends AbstractPostgresAware {

  @EJB
  UserDao userDao;


  @Test
  public void loginJozsiUser() throws EhealthException {
    WebUser wu = new WebUser();
    wu.setPassword("jozsi");
    wu.setUserGroup(WebUserGroupEnum.Citizen);
    wu.setUserId("jozsi");

    userDao.persist(wu);

    WebUser ru = userDao.findWebUserByName("jozsi");
    Assert.assertEquals(wu.getPassword(), ru.getPassword());
  }
}
