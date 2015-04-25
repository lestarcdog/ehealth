package dao;

import hu.bme.diploma.a7e7yk.constants.EhealthConstants;
import hu.bme.diploma.a7e7yk.dao.hbase.MeasurementsDao;
import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.ActivityMonitorVitalSign;
import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.ThermometerVitalSign;
import hu.bme.diploma.a7e7yk.exceptions.EhealthException;
import hu.bme.diploma.a7e7yk.hbase.schemagen.Schemagenerator;

import java.io.IOException;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.util.List;

import javax.ejb.EJB;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import schemagen.HbaseTestConstants;

public class MeasurementDaoTest extends AbstractEjbAwareTest {

  @EJB
  MeasurementsDao measurementsDao;

  @BeforeClass
  public static void init() throws IOException {
    // measurementsDao = new MeasurementsDao(HbaseTestConstants.MEASUREMENTS_TESTTABLE);
    Schemagenerator.createMeasurements(HbaseTestConstants.MEASUREMENTS_TESTTABLE);
  }


  @Test
  public void getActivityMonitorData() throws EhealthException {
    String userId = "TAJSZAM123ACT";
    ActivityMonitorVitalSign v = new ActivityMonitorVitalSign();
    long d = ZonedDateTime.now().toEpochSecond();
    v.setMeasurementTime(ZonedDateTime.ofInstant(Instant.ofEpochSecond(d), EhealthConstants.DEFAULT_BUDAPEST_ZONEID));
    v.getSpeed().setValue(5.2);
    v.getActivePeriod().setValue(6.0);
    measurementsDao.persistMeasurement(userId, v);

    List<ActivityMonitorVitalSign> vs =
        measurementsDao.findByRowkey(userId, v.getMdcMeasurementType(), v.getMeasurementTime(),
            ActivityMonitorVitalSign.class);

    Assert.assertEquals(1, vs.size());
    ActivityMonitorVitalSign rv = vs.get(0);
    Assert.assertEquals(v.getSpeed().getValue(), rv.getSpeed().getValue());
    Assert.assertEquals(v.getActivePeriod().getValue(), rv.getActivePeriod().getValue());
    Assert.assertEquals(v.getMeasurementTime(), rv.getMeasurementTime());

  }

  @Test
  public void getThermometerData() throws EhealthException {
    String userId = "TAJSZAM123TEMP";
    ThermometerVitalSign v = new ThermometerVitalSign();
    long d = ZonedDateTime.now().toEpochSecond();
    v.setMeasurementTime(ZonedDateTime.ofInstant(Instant.ofEpochSecond(d), EhealthConstants.DEFAULT_BUDAPEST_ZONEID));
    v.getTemp().setValue(35.2);

    measurementsDao.persistMeasurement(userId, v);

    List<ThermometerVitalSign> vs =
        measurementsDao.findByRowkey(userId, v.getMdcMeasurementType(), v.getMeasurementTime(),
            ThermometerVitalSign.class);

    Assert.assertEquals(1, vs.size());
    ThermometerVitalSign rv = vs.get(0);
    Assert.assertEquals(v.getTemp().getValue(), rv.getTemp().getValue());
    Assert.assertEquals(v.getMeasurementTime(), rv.getMeasurementTime());

  }
}
