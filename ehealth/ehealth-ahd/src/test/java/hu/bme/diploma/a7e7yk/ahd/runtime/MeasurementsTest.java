package hu.bme.diploma.a7e7yk.ahd.runtime;

import hu.bme.diploma.a7e7yk.datamodel.ahd.AHDModel;
import hu.bme.diploma.a7e7yk.datamodel.ahd.measurements.AbstractMeasurement;
import hu.bme.diploma.a7e7yk.datamodel.ahd.measurements.ActivityMonitorMeasurement;
import hu.bme.diploma.a7e7yk.datamodel.ahd.measurements.BloodPressureMeasurement;
import hu.bme.diploma.a7e7yk.datamodel.ahd.measurements.GlucoseMeasurement;
import hu.bme.diploma.a7e7yk.datamodel.ahd.measurements.PulseOxymeterMeasurement;
import hu.bme.diploma.a7e7yk.datamodel.ahd.measurements.ThermometerMeasurement;
import hu.bme.diploma.a7e7yk.datamodel.ahd.measurements.WeightScaleMeasurement;
import hu.bme.diploma.a7e7yk.datamodel.health.PersonModel;
import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.ActivityMonitorValue;
import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.BloodPressureValue;
import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.GlucoseValue;
import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.MeasurementTime;
import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.PulseOxyMeterValue;
import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.ThermometerValue;
import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.WeightScaleValue;
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
    GlucoseValue v = new GlucoseValue();
    v.setGlucose(6.5);
    t.setGlucoseValue(v);
    t.setMeasurementTime(mt);

    pcd_01builder(t);
  }

  @Test
  public void activityMonitorTest() throws HL7Exception, IOException {
    ActivityMonitorMeasurement t = new ActivityMonitorMeasurement();
    ActivityMonitorValue v = new ActivityMonitorValue();
    t.setMeasurementTime(mt);
    v.setAltitude(3.2);
    v.setSpeed(10.0);
    v.setActivePeriod(5.0);
    t.setValue(v);

    pcd_01builder(t);
  }


  @Test
  public void weightscaleTest() throws HL7Exception, IOException {
    WeightScaleMeasurement t = new WeightScaleMeasurement();
    WeightScaleValue v = new WeightScaleValue();
    v.setWeight(117.0);
    v.setHeight(192.0);
    t.setValue(v);
    t.setMeasurementTime(mt);

    pcd_01builder(t);
  }

  @Test
  public void bloosPressureTest() throws HL7Exception, IOException {
    BloodPressureMeasurement t = new BloodPressureMeasurement();
    BloodPressureValue v = new BloodPressureValue();
    t.setMeasurementTime(mt);
    v.setDiastolic(95.0);
    v.setSystolic(140.5);
    v.setPulseRate(75.5);
    t.setValue(v);

    pcd_01builder(t);
  }

  @Test
  public void thermometerTest() throws HL7Exception, IOException {
    ThermometerMeasurement t = new ThermometerMeasurement();
    ThermometerValue v = new ThermometerValue();
    t.setMeasurementTime(mt);
    v.setTemp(35.69);
    t.setValue(v);

    pcd_01builder(t);
  }

  @Test
  public void pulseOxyMeterTest() throws HL7Exception, IOException {
    PulseOxymeterMeasurement t = new PulseOxymeterMeasurement();
    PulseOxyMeterValue v = new PulseOxyMeterValue();
    t.setMeasurementTime(mt);
    v.setSpo2(80.9);
    v.setPulseRate(72.3);
    t.setValue(v);

    pcd_01builder(t);
  }

  @Test
  public void convertMdcIdAndBack() {
    int x = NomenclatureHelper.getContinuaValueId(BloodPressureValue.MDC_VALUE);
    Assert.assertEquals(BloodPressureValue.MDC_VALUE.getValue(),
        NomenclatureHelper.getIdFromContinuaValue(x));
  }

  private void pcd_01builder(AbstractMeasurement mm) throws HL7Exception, IOException {
    PCD_01MessageBuilder builder = new PCD_01MessageBuilder(ahdm, p);
    Message m = builder.generateMessage(mm);
    Parser parser = ctx.getPipeParser();
    String msg = parser.encode(m);
    System.err.println(msg);
  }



}
