package hu.bme.diploma.a7e7yk.ahd.runtime;

import hu.bme.diploma.a7e7yk.ahd.datamodel.data.AHDModel;
import hu.bme.diploma.a7e7yk.ahd.datamodel.data.PersonModel;
import hu.bme.diploma.a7e7yk.ahd.datamodel.data.TimeModel;
import hu.bme.diploma.a7e7yk.ahd.datamodel.measurements.AbstractMeasurement;
import hu.bme.diploma.a7e7yk.ahd.datamodel.measurements.ActivityMonitorMeasurement;
import hu.bme.diploma.a7e7yk.ahd.datamodel.measurements.BloodPressureMeasurement;
import hu.bme.diploma.a7e7yk.ahd.datamodel.measurements.GlucoseMeasurement;
import hu.bme.diploma.a7e7yk.ahd.datamodel.measurements.PulseOxymeterMeasurement;
import hu.bme.diploma.a7e7yk.ahd.datamodel.measurements.Thermometer;
import hu.bme.diploma.a7e7yk.ahd.datamodel.measurements.WeightScaleMeasurement;

import java.io.IOException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import org.junit.Before;
import org.junit.Test;

import ca.uhn.hl7v2.DefaultHapiContext;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.HapiContext;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.parser.Parser;
import ca.uhn.hl7v2.validation.builder.support.NoValidationBuilder;

public class MeasurementsTest {


  private AHDModel ahdm;
  private TimeModel tm;
  private PersonModel p;
  private HapiContext ctx = new DefaultHapiContext();

  @Before
  public void setUp() {
    ctx.setValidationRuleBuilder(new NoValidationBuilder());

    ahdm = new AHDModel();
    ahdm.setSendingApplicationName("Cdog Health Ltd.");
    ahdm.setSendingApplicationCode("6CF049DB5F02");
    ahdm.setSendingApplicationFormat("EUI-64");

    tm = new TimeModel();
    ZonedDateTime mt = ZonedDateTime.of(2015, 1, 18, 15, 30, 0, 0, ZoneId.of("Europe/Budapest"));
    tm.setMeasurementTime(mt);
    ahdm.setTimeModel(tm);

    p = new PersonModel();
    p.setFamilyName("Lófasz");
    p.setGivenName("János");
    p.setSsn("SSN3456789");
    p.setBirthDate(LocalDate.of(1990, 12, 20));
  }

  @Test
  public void glucoseTest() throws HL7Exception, IOException {
    GlucoseMeasurement t = new GlucoseMeasurement();
    t.setGlucose(6.7);
    t.setTimeModel(tm);

    pcd_01builder(t);
  }

  @Test
  public void activityMonitorTest() throws HL7Exception, IOException {
    ActivityMonitorMeasurement t = new ActivityMonitorMeasurement();
    t.setTimeModel(tm);
    t.setAltitude(3.2);
    t.setSpeed(10.0);

    pcd_01builder(t);
  }


  @Test
  public void weightscaleTest() throws HL7Exception, IOException {
    WeightScaleMeasurement t = new WeightScaleMeasurement();
    t.setWeight(117.0);
    t.setHeight(192.0);
    t.setTimeModel(tm);

    pcd_01builder(t);
  }

  @Test
  public void bloosPressureTest() throws HL7Exception, IOException {
    BloodPressureMeasurement t = new BloodPressureMeasurement();
    t.setTimeModel(tm);
    t.setDiastolic(95.0);
    t.setSystolic(140.5);
    t.setPulseRate(75.5);

    pcd_01builder(t);
  }

  @Test
  public void thermometerTest() throws HL7Exception, IOException {
    Thermometer t = new Thermometer();
    t.setTimeModel(tm);
    t.setTemp(35.69);

    pcd_01builder(t);
  }

  @Test
  public void pulseOxyMeterTest() throws HL7Exception, IOException {
    PulseOxymeterMeasurement t = new PulseOxymeterMeasurement();
    t.setTimeModel(tm);
    t.setSpo2(80.9);
    t.setPulseRate(72.3);

    pcd_01builder(t);
  }

  private void pcd_01builder(AbstractMeasurement mm) throws HL7Exception, IOException {
    PCD_01MessageBuilder builder = new PCD_01MessageBuilder(ahdm, p);
    Message m = builder.generateMessage(mm);
    Parser parser = ctx.getPipeParser();
    String msg = parser.encode(m);
    System.err.println(msg);
  }

}