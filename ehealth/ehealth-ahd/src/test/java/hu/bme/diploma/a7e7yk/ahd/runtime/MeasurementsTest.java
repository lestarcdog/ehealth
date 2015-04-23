package hu.bme.diploma.a7e7yk.ahd.runtime;

import hu.bme.diploma.a7e7yk.ahd.measurements.AbstractMeasurement;
import hu.bme.diploma.a7e7yk.ahd.measurements.ActivityMonitorMeasurement;
import hu.bme.diploma.a7e7yk.ahd.measurements.BloodPressureMeasurement;
import hu.bme.diploma.a7e7yk.ahd.measurements.GlucoseMeasurement;
import hu.bme.diploma.a7e7yk.ahd.measurements.MeasurementTime;
import hu.bme.diploma.a7e7yk.ahd.measurements.PulseOxymeterMeasurement;
import hu.bme.diploma.a7e7yk.ahd.measurements.ThermometerMeasurement;
import hu.bme.diploma.a7e7yk.ahd.measurements.WeightScaleMeasurement;
import hu.bme.diploma.a7e7yk.ahd.messagebuilder.PCD_01MessageBuilder;
import hu.bme.diploma.a7e7yk.datamodel.ahd.AHDModel;
import hu.bme.diploma.a7e7yk.datamodel.health.PersonModel;
import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.AbstractVitalSign;
import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.ActivityMonitorVitalSign;
import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.BloodPressureVitalSign;
import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.GlucoseVitalSign;
import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.PulseOxyMeterVitalSign;
import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.ThermometerVitalSign;
import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.WeightScaleVitalSign;
import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.NomenclatureHelper;

import java.io.IOException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import org.junit.Assert;
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
  private MeasurementTime mt;
  private PersonModel p;
  private HapiContext ctx = new DefaultHapiContext();

  @Before
  public void setUp() {
    ctx.setValidationRuleBuilder(new NoValidationBuilder());

    ahdm = new AHDModel();
    ahdm.setSendingApplicationName("Cdog Health Ltd.");
    ahdm.setSendingApplicationCode("6CF049DB5F02");
    ahdm.setSendingApplicationFormat("EUI-64");

    mt = new MeasurementTime();
    mt.setMeasurementTime(ZonedDateTime.of(2015, 1, 18, 15, 30, 0, 0, ZoneId.of("Europe/Budapest")));

    p = new PersonModel();
    p.setFamilyName("Lófasz");
    p.setGivenName("János");
    p.setSsn("SSN3456789");
    p.setBirthDate(LocalDate.of(1990, 12, 20));
  }

  @Test
  public void glucoseTest() throws HL7Exception, IOException {
    GlucoseMeasurement t = new GlucoseMeasurement();
    GlucoseVitalSign v = new GlucoseVitalSign();
    v.getGlucose().setValue(6.5);
    v.setMeasurementTime(ZonedDateTime.now());
    t.setValue(v);

    pcd_01builder(t);
  }

  @Test
  public void activityMonitorTest() throws HL7Exception, IOException {
    ActivityMonitorMeasurement t = new ActivityMonitorMeasurement();
    ActivityMonitorVitalSign v = new ActivityMonitorVitalSign();
    v.getAltitude().setValue(3.2);
    v.getSpeed().setValue(10.0);
    v.getActivePeriod().setValue(5.0);
    v.setMeasurementTime(ZonedDateTime.now());
    t.setValue(v);

    pcd_01builder(t);
  }


  @Test
  public void weightscaleTest() throws HL7Exception, IOException {
    WeightScaleMeasurement t = new WeightScaleMeasurement();
    WeightScaleVitalSign v = new WeightScaleVitalSign();
    v.getWeight().setValue(117.0);
    v.getHeight().setValue(192.0);
    v.setMeasurementTime(ZonedDateTime.now());
    t.setValue(v);
    pcd_01builder(t);
  }

  @Test
  public void bloosPressureTest() throws HL7Exception, IOException {
    BloodPressureMeasurement t = new BloodPressureMeasurement();
    BloodPressureVitalSign v = new BloodPressureVitalSign();
    v.getDiastolic().setValue(95.0);
    v.getSystolic().setValue(140.5);
    v.getPulseRate().setValue(75.5);
    v.setMeasurementTime(ZonedDateTime.now());
    t.setValue(v);

    pcd_01builder(t);
  }

  @Test
  public void thermometerTest() throws HL7Exception, IOException {
    ThermometerMeasurement t = new ThermometerMeasurement();
    ThermometerVitalSign v = new ThermometerVitalSign();
    v.getTemp().setValue(35.69);
    v.setMeasurementTime(ZonedDateTime.now());
    t.setValue(v);

    pcd_01builder(t);
  }

  @Test
  public void pulseOxyMeterTest() throws HL7Exception, IOException {
    PulseOxymeterMeasurement t = new PulseOxymeterMeasurement();
    PulseOxyMeterVitalSign v = new PulseOxyMeterVitalSign();
    v.getSpo2().setValue(80.9);
    v.getPulseRate().setValue(72.3);
    v.setMeasurementTime(ZonedDateTime.now());
    t.setValue(v);

    pcd_01builder(t);
  }

  @Test
  public void convertMdcIdAndBack() {
    int x = NomenclatureHelper.getContinuaValueId(BloodPressureVitalSign.MDC_VALUE);
    Assert.assertEquals(BloodPressureVitalSign.MDC_VALUE.getId(), NomenclatureHelper.getIdFromContinuaValue(x));
  }

  private void pcd_01builder(AbstractMeasurement<? extends AbstractVitalSign> mm) throws HL7Exception, IOException {
    PCD_01MessageBuilder builder = new PCD_01MessageBuilder(ahdm, p);
    Message m = builder.generateMessage(mm);
    Parser parser = ctx.getPipeParser();
    String msg = parser.encode(m);
    System.err.println(msg);
  }



}
