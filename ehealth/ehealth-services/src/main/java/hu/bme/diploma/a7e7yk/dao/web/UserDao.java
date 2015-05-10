package hu.bme.diploma.a7e7yk.dao.web;

import hu.bme.diploma.a7e7yk.datamodel.entity.WebUser;
import hu.bme.diploma.a7e7yk.exceptions.EhealthException;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.TypedQuery;

@Local
@Stateless
public class UserDao extends CommonDao {

  private static final String findByUsername = "SELECT w FROM WebUser w WHERE w.userId = :userId";

  public WebUser findWebUserByName(String userId) throws EhealthException {
    TypedQuery<WebUser> q = em.createQuery(findByUsername, WebUser.class);
    q.setParameter("userId", userId);
    try {
      return q.getSingleResult();
    } catch (Throwable e) {
      throw new EhealthException("User not found");
    }
  }



}
