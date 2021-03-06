package hu.bme.diploma.a7e7yk.ahd.runtime;

import hu.bme.diploma.a7e7yk.ahd.AhdConstants;
import hu.bme.diploma.a7e7yk.ahd.measurements.AbstractMeasurement;
import hu.bme.diploma.a7e7yk.ahd.measurements.ActivityMonitorMeasurement;
import hu.bme.diploma.a7e7yk.ahd.measurements.BloodPressureMeasurement;
import hu.bme.diploma.a7e7yk.ahd.measurements.GlucoseMeasurement;
import hu.bme.diploma.a7e7yk.ahd.measurements.PulseOxymeterMeasurement;
import hu.bme.diploma.a7e7yk.ahd.measurements.ThermometerMeasurement;
import hu.bme.diploma.a7e7yk.ahd.measurements.WeightScaleMeasurement;
import hu.bme.diploma.a7e7yk.ahd.messagebuilder.PCD_01MessageBuilder;
import hu.bme.diploma.a7e7yk.ahd.mqttclient.IMqttCommunicator;
import hu.bme.diploma.a7e7yk.ahd.mqttclient.MqttCommunicatorBlocking;
import hu.bme.diploma.a7e7yk.datamodel.ahd.AHDModel;
import hu.bme.diploma.a7e7yk.datamodel.health.PersonModel;
import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.AbstractVitalSign;
import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.ActivityMonitorVitalSign;
import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.BloodPressureVitalSign;
import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.GlucoseVitalSign;
import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.PulseOxyMeterVitalSign;
import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.ThermometerVitalSign;
import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.WeightScaleVitalSign;

import java.math.BigDecimal;
import java.math.RoundingMode;
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
  private static final double PULSE_RATE = 70;
  private static final double PULSE_RATE_BASELINE = 20;
  private static final double SPO2_RATE = 90;
  private static final double SPO2_BASELINE = 10;
  private static final double GLUCOSE = 2;
  private static final double GLUCOSE_BASELINE = 2;
  private static final double THERMOMETER = 90;
  private static final double THERMOMETER_BASELINE = 90;
  private static final double WEIGHT_SCALE = 2;
  private static final double WEIGHT_SCALE_BASELINE = 80;

  // ----------

  private static final Logger logger = LoggerFactory.getLogger(MessageGenerator.class);
  private static final int SLEEP_TIME_MAX = 4000;
  private static final int SLEEP_TIME_BASE = 4000;

  private AHDModel ahdModel;
  private Map<String, PersonModel> personModels = new HashMap<>();
  private final Random rand = new Random();
  private List<IMqttCommunicator> mqttCommunicators = new ArrayList<>();



  public static void main(String[] args) {
    MessageGenerator generator = new MessageGenerator();
    generator.setupAhd();
    generator.setupPersonModel();
    generator.setupMqttCommunicators();

    if (args.length == 1) {
      Integer msgCount = Integer.valueOf(args[0]);
      for (int i = 0; i < msgCount; ++i) {
        generator.sendMessage();
      }
      System.exit(0);
    }

    // start this thing
    System.out.println("Stop me with CTRL+C");
    Random sleep = new Random();
    while (true) {
      generator.sendMessage();
      try {
        logger.info("sleeping...");
        Thread.sleep(SLEEP_TIME_BASE + sleep.nextInt(SLEEP_TIME_MAX));
      } catch (InterruptedException e) {
        logger.error(null, e);
      }
    }
  }

  private void sendMessage() {
    IMqttCommunicator mqtt = mqttCommunicators.get(rand.nextInt(mqttCommunicators.size()));
    PersonModel personModel = personModels.get(mqtt.getSenderId());
    ahdModel.setSenderId(mqtt.getSenderId());
    PCD_01MessageBuilder builder;
    logger.info("sending message to {}", mqtt.getSenderId());
    try {
      builder = new PCD_01MessageBuilder(ahdModel, personModel);
      mqtt.sendMessage(builder.generateMessageAsString(selectRandomMeasurement()).getBytes());
    } catch (Exception e) {
      logger.error(null, e);
    }


  }

  private AbstractMeasurement<?> selectRandomMeasurement() {
    int i = rand.nextInt(6);
    AbstractMeasurement<? extends AbstractVitalSign> m = null;
    switch (i) {
      case 0:
        m = new ActivityMonitorMeasurement();
        ActivityMonitorVitalSign mm = new ActivityMonitorVitalSign();
        mm.getActivePeriod().setValue(5.0);
        mm.getAltitude().setValue(getRandomDouble(ALTITUDE));
        mm.getSpeed().setValue(getRandomDouble(SPEED));
        mm.setMeasurementTime(getCurrentTime());
        ((ActivityMonitorMeasurement) m).setValue(mm);
        break;
      case 1:
        m = new BloodPressureMeasurement();
        BloodPressureVitalSign mm2 = new BloodPressureVitalSign();
        mm2.getDiastolic().setValue(getRandomDouble(DIASTOLIC, DIASTOLIC_BASELINE));
        mm2.getSystolic().setValue(getRandomDouble(SYSTOLIC, SYSTOLIC_BASELINE));
        mm2.getPulseRate().setValue(getRandomDouble(PULSE_RATE, PULSE_RATE_BASELINE));
        ((BloodPressureMeasurement) m).setValue(mm2);
        break;
      case 2:
        m = new GlucoseMeasurement();
        GlucoseVitalSign mm3 = new GlucoseVitalSign();
        mm3.getGlucose().setValue(getRandomDouble(GLUCOSE, GLUCOSE_BASELINE));
        ((GlucoseMeasurement) m).setValue(mm3);
        break;
      case 3:
        m = new PulseOxymeterMeasurement();
        PulseOxyMeterVitalSign mm4 = new PulseOxyMeterVitalSign();
        mm4.getSpo2().setValue(getRandomDouble(SPO2_RATE, SPO2_BASELINE));
        ((PulseOxymeterMeasurement) m).setValue(mm4);
        break;
      case 4:
        m = new ThermometerMeasurement();
        ThermometerVitalSign mm5 = new ThermometerVitalSign();
        mm5.getTemp().setValue(getRandomDouble(THERMOMETER, THERMOMETER_BASELINE));
        ((ThermometerMeasurement) m).setValue(mm5);
        break;
      case 5:
        m = new WeightScaleMeasurement();
        WeightScaleVitalSign mm6 = new WeightScaleVitalSign();
        mm6.getWeight().setValue(getRandomDouble(WEIGHT_SCALE, WEIGHT_SCALE_BASELINE));
        ((WeightScaleMeasurement) m).setValue(mm6);
        break;
      default:
        throw new UnsupportedOperationException("Something is messed up with the indices");
    }
    m.getValue().setMeasurementTime(ZonedDateTime.now(AhdConstants.TIME_ZONE_BUDAPEST));
    return m;
  }

  private double getRandomDouble(double maxBound, double baseline) {
    return new BigDecimal((rand.nextDouble() * maxBound) + baseline).setScale(DOUBLE_PRESICION, RoundingMode.HALF_DOWN)
        .doubleValue();
  }

  private double getRandomDouble(double maxBound) {
    return new BigDecimal(rand.nextDouble() * maxBound).setScale(DOUBLE_PRESICION, RoundingMode.HALF_DOWN)
        .doubleValue();
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
