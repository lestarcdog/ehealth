package hu.bme.diploma.a7e7yk.ahd.runtime;

import hu.bme.diploma.a7e7yk.ahd.AhdConstants;
import hu.bme.diploma.a7e7yk.ahd.measurements.AbstractMeasurement;
import hu.bme.diploma.a7e7yk.ahd.measurements.ActivityMonitorMeasurement;
import hu.bme.diploma.a7e7yk.ahd.measurements.BloodPressureMeasurement;
import hu.bme.diploma.a7e7yk.ahd.measurements.GlucoseMeasurement;
import hu.bme.diploma.a7e7yk.ahd.measurements.PulseOxymeterMeasurement;
import hu.bme.diploma.a7e7yk.ahd.measurements.ThermometerMeasurement;
import hu.bme.diploma.a7e7yk.ahd.measurements.WeightScaleMeasurement;
import hu.bme.diploma.a7e7yk.ahd.mqttclient.IMqttCommunicator;
import hu.bme.diploma.a7e7yk.ahd.mqttclient.MqttCommunicatorBlocking;
import hu.bme.diploma.a7e7yk.datamodel.ahd.AHDModel;
import hu.bme.diploma.a7e7yk.datamodel.health.PersonModel;
import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.ActivityMonitorValue;
import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.BloodPressureValue;
import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.GlucoseValue;
import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.PulseOxyMeterValue;
import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.ThermometerValue;
import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.WeightScaleValue;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MessageGenerator {

  // ---------- RANDOM VALUES
  // --- DOUBLE PRECISION
  private static final int DOUBLE_PRESICION = 2;
  private static final double ALTITUDE = 2.0;
  private static final double SPEED = 5.0;
  private static final double DIASTOLIC = 80;
  private static final double DIASTOLIC_BASELINE = 90;
  private static final double SYSTOLIC = 80;
  private static final double SYSTOLIC_BASELINE = 90;
  private static final double SPO2_RATE = 30;
  private static final double SPO2_BASELINE = 60;
  private static final double GLUCOSE = 2;
  private static final double GLUCOSE_BASELINE = 2;
  private static final double PULSE_OXYMETER = 10;
  private static final double PULSE_OXYMETER_BASELINE = 90;
  private static final double THERMOMETER = 90;
  private static final double THERMOMETER_BASELINE = 90;
  private static final double WEIGHT_SCALE = 2;
  private static final double WEIGHT_SCALE_BASELINE = 80;

  // ----------

  private static final Logger logger = LoggerFactory.getLogger(MessageGenerator.class);
  private static final int SLEEP_TIME_MAX = 8000;

  private AHDModel ahdModel;
  private Map<String, PersonModel> personModels = new HashMap<>();
  private final Random rand = new Random();
  private List<IMqttCommunicator> mqttCommunicators = new ArrayList<>();



  public static void main(String[] args) {
    MessageGenerator generator = new MessageGenerator();
    generator.setupAhd();
    generator.setupPersonModel();
    generator.setupMqttCommunicators();


    // start this thing
    System.out.println("Stop me with CTRL+C");
    Random sleep = new Random();
    while (true) {
      generator.sendMessage();
      try {
        Thread.sleep(sleep.nextInt(SLEEP_TIME_MAX));
      } catch (InterruptedException e) {
        logger.error(null, e);
      }
    }
  }

  private void sendMessage() {
    IMqttCommunicator mqtt = mqttCommunicators.get(rand.nextInt(mqttCommunicators.size()));
    PersonModel personModel = personModels.get(mqtt.getSenderId());
    ahdModel.setSenderId(mqtt.getSenderId());


  }

  private AbstractMeasurement<?> selectRandomMeasurement() {
    int i = rand.nextInt(7);
    AbstractMeasurement<?> m = null;
    switch (i) {
      case 0:
        m = new ActivityMonitorMeasurement();
        ActivityMonitorValue mm = new ActivityMonitorValue();
        mm.setActivePeriod(5.0);
        mm.setAltitude(getRandomDouble(ALTITUDE));
        mm.setSpeed(getRandomDouble(SPEED));
        mm.setMeasurementTime(getCurrentTime());
        ((ActivityMonitorMeasurement) m).setValue(mm);
        break;
      case 1:
        m = new BloodPressureMeasurement();
        BloodPressureValue mm2 = new BloodPressureValue();
        mm2.setDiastolic(getRandomDouble(DIASTOLIC, DIASTOLIC_BASELINE));
        mm2.setSystolic(getRandomDouble(SYSTOLIC, SYSTOLIC_BASELINE));
        mm2.setPulseRate(getRandomDouble(SPO2_RATE, PULSE_OXYMETER_BASELINE));
        ((BloodPressureMeasurement) m).setValue(mm2);
        break;
      case 2:
        m = new GlucoseMeasurement();
        GlucoseValue mm3 = new GlucoseValue();
        mm3.setGlucose(getRandomDouble(GLUCOSE, GLUCOSE_BASELINE));
        ((GlucoseMeasurement) m).setValue(mm3);
        break;
      case 3:
        m = new PulseOxymeterMeasurement();
        PulseOxyMeterValue mm4 = new PulseOxyMeterValue();
        mm4.setSpo2(getRandomDouble(PULSE_OXYMETER, PULSE_OXYMETER_BASELINE));
        ((PulseOxymeterMeasurement) m).setValue(mm4);
        break;
      case 4:
        m = new ThermometerMeasurement();
        ThermometerValue mm5 = new ThermometerValue();
        mm5.setTemp(getRandomDouble(THERMOMETER, THERMOMETER_BASELINE));
        ((ThermometerMeasurement) m).setValue(mm5);
        break;
      case 5:
        m = new WeightScaleMeasurement();
        WeightScaleValue mm6 = new WeightScaleValue();
        mm6.setWeight(getRandomDouble(WEIGHT_SCALE, WEIGHT_SCALE_BASELINE));
        ((WeightScaleMeasurement) m).setValue(mm6);
        break;
      default:
        throw new UnsupportedOperationException("Something is messed up with the indices");
    }
    return m;
  }

  private double getRandomDouble(double maxBound, double baseline) {
    return new BigDecimal((rand.nextDouble() * maxBound) + baseline).setScale(DOUBLE_PRESICION).doubleValue();
  }

  private double getRandomDouble(double maxBound) {
    return new BigDecimal(rand.nextDouble() * maxBound).setScale(DOUBLE_PRESICION).doubleValue();
  }



  private ZonedDateTime getCurrentTime() {
    return ZonedDateTime.now(AhdConstants.TIME_ZONE_BUDAPEST);
  }

  private void setupMqttCommunicators() {
    try {
      mqttCommunicators.add(new MqttCommunicatorBlocking("jozsi", "jozsi"));
    } catch (Exception e) {
      logger.error(null, e);
    }
    try {
      mqttCommunicators.add(new MqttCommunicatorBlocking("mari", "mari"));
    } catch (Exception e) {
      logger.error(null, e);
    }

  }

  private void setupPersonModel() {
    // jozsi
    PersonModel model = new PersonModel();
    model.setBirthDate(LocalDate.of(1981, 11, 25));
    model.setFamilyName("Kiss");
    model.setGivenName("József");
    model.setSsn("123456789");
    personModels.put("jozsi", model);

    // mari
    model = new PersonModel();
    model.setBirthDate(LocalDate.of(1965, 8, 22));
    model.setFamilyName("Szabóné");
    model.setGivenName("Mária");
    model.setSsn("111111111");
    personModels.put("mari", model);
  }

  private void setupAhd() {
    ahdModel = new AHDModel();
    ahdModel.setCompanyName("Cdog Health Ltd.");
    ahdModel.setSendingApplicationName("Cdog Health Ltd.");
    ahdModel.setSendingApplicationCode("6CF049DB5F02");
    ahdModel.setSendingApplicationFormat("EUI-64");
  }
}
