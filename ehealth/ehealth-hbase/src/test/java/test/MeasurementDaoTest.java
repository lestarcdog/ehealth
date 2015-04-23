package test;

import hu.bme.diploma.a7e7yk.dao.MeasurementsDao;
import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.GlucoseVitalSign;

import java.io.IOException;
import java.time.ZonedDateTime;

import javax.ejb.EJB;

import org.junit.Before;
import org.junit.Test;

public class MeasurementDaoTest {

  @EJB
  MeasurementsDao measurementsDao;

  @Before
  public void init() throws IOException {
    measurementsDao = new MeasurementsDao();
  }

  @Test
  public void persistVitalSign() {
    String userId = "TAJSZAM123";
    GlucoseVitalSign g = new GlucoseVitalSign();
    g.getGlucose().setValue(6.5);
    g.setMeasurementTime(ZonedDateTime.now());
    measurementsDao.persistMeasurement(userId, g);
  }


}
