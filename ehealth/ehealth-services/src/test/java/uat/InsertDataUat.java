package uat;

import hu.bme.diploma.a7e7yk.dao.web.UserDao;
import hu.bme.diploma.a7e7yk.datamodel.entity.Citizen;
import hu.bme.diploma.a7e7yk.datamodel.entity.ClinicalPersonal;
import hu.bme.diploma.a7e7yk.datamodel.entity.WebUser;
import hu.bme.diploma.a7e7yk.datamodel.enums.WebUserGroupEnum;

import java.time.LocalDate;

import javax.ejb.EJB;

import org.apache.commons.codec.digest.DigestUtils;
import org.junit.Test;
import org.springframework.test.context.transaction.TransactionConfiguration;

import dao.AbstractPostgresAware;

@TransactionConfiguration(defaultRollback = false)
public class InsertDataUat extends AbstractPostgresAware {

  @EJB
  UserDao userDao;

  @Test
  public void insertTestDate() {
    Citizen citizen = new Citizen();
    citizen.setBirthDate(LocalDate.of(1990, 10, 20));
    citizen.setName("Kovács József");
    citizen.setSsn("123456789");


    WebUser wu = new WebUser();
    wu.setPassword(DigestUtils.sha1Hex("jozsi"));
    wu.setUserId("jozsi");
    wu.setUserGroup(WebUserGroupEnum.Citizen);
    wu.setCitizen(citizen);

    userDao.persist(wu);

    Citizen citizen2 = new Citizen();
    citizen2.setBirthDate(LocalDate.of(1966, 3, 12));
    citizen2.setName("Kiss Mária");
    citizen2.setSsn("555544444");

    WebUser wu2 = new WebUser();
    wu2.setCitizen(citizen2);
    wu2.setUserGroup(WebUserGroupEnum.Citizen);
    wu2.setUserId("marika");
    wu2.setPassword(DigestUtils.sha1Hex("marika"));

    userDao.persist(wu2);

    WebUser wu3 = new WebUser();
    wu3.setPassword(DigestUtils.sha1Hex("orvos"));
    wu3.setUserId("orvos");
    wu3.setUserGroup(WebUserGroupEnum.ClinicalPersonal);

    userDao.persist(wu3);

    ClinicalPersonal p = new ClinicalPersonal();
    p.setId(wu3);
    p.getPatients().add(citizen);
    p.getPatients().add(citizen2);

    userDao.persist(p);

  }
}
