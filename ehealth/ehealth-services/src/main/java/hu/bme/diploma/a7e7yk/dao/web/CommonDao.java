package hu.bme.diploma.a7e7yk.dao.web;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
@Local
public class CommonDao {

  @PersistenceContext(unitName = "ehealth-pu")
  protected EntityManager em;

  public void persist(Object object) {
    em.persist(object);
  }

  public void flush() {
    em.flush();
  }

  public <T> T merge(T object) {
    return em.merge(object);
  }

  public <T> T find(Class<T> clazz, Object id) {
    return em.find(clazz, id);
  }
}
