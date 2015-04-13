package hu.bme.diploma.a7e7yk.ahd.runtime;

import hu.bme.diploma.a7e7yk.ahd.AhdConstants;
import hu.bme.diploma.a7e7yk.ahd.measurements.AbstractMeasurement;
import hu.bme.diploma.a7e7yk.ahd.measurements.ActivityMonitorMeasurement;
import hu.bme.diploma.a7e7yk.ahd.mqttclient.IMqttCommunicator;
import hu.bme.diploma.a7e7yk.ahd.mqttclient.MqttCommunicatorBlocking;
import hu.bme.diploma.a7e7yk.datamodel.ahd.AHDModel;
import hu.bme.diploma.a7e7yk.datamodel.health.PersonModel;
import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.ActivityMonitorValue;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MessageGenerator {

  // ---------- RANDOM VALUES
  // --- DOUBLE PRECISION
  private static final int DOUBLE_PRESICION = 2;
  private static final double ALTITUDE_RAND = 2.0;
  private static final double SPEED_RAND = 5.0;
  // ----------

  private static final Logger logger = LoggerFactory.getLogger(MessageGenerator.class);
  private static final int SLEEP_TIME_MAX = 8000;

  private AHDModel ahdModel;
  private Map<String, PersonModel> personModel = new HashMap<>();
  private final Random personRand = new Random();
  private final Random measurementRand = new Random();
  private final Random valueRand = new Random();
  private Map<String, IMqttCommunicator> mqttCommunicators = new HashMap<>();



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

  }

  private AbstractMeasurement selectRandomMeasurement() {
    int i = measurementRand.nextInt(7);
    AbstractMeasurement m = null;
    switch (i) {
      case 0:
        m = new ActivityMonitorMeasurement();
        ActivityMonitorValue mm = new ActivityMonitorValue();
        mm.setActivePeriod(5.0);
        mm.setAltitude(getRandomDouble(ALTITUDE_RAND));
        mm.setSpeed(getRandomDouble(SPEED_RAND));
        mm.setMeasurementTime(getCurrentTime());

        break;
      case 1:
        break;
      case 2:
        break;
      case 3:
        break;
      case 4:
        break;
      case 5:
        break;
      case 7:
        break;
      default:
        throw new UnsupportedOperationException("Something is messed up with the indices");
    }
    return m;
  }

  private double getRandomDouble(double maxBound) {
    return new BigDecimal(valueRand.nextDouble() * maxBound).setScale(DOUBLE_PRESICION).doubleValue();
  }

  private ZonedDateTime getCurrentTime() {
    return ZonedDateTime.now(AhdConstants.TIME_ZONE_BUDAPEST);
  }

  private void setupMqttCommunicators() {
    try {
      mqttCommunicators.put("jozsi", new MqttCommunicatorBlocking("jozsi", "jozsi"));
    } catch (Exception e) {
      logger.error(null, e);
    }
    try {
      mqttCommunicators.put("mari", new MqttCommunicatorBlocking("mari", "mari"));
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
    personModel.put("jozsi", model);

    // mari
    model = new PersonModel();
    model.setBirthDate(LocalDate.of(1965, 8, 22));
    model.setFamilyName("Szabóné");
    model.setGivenName("Mária");
    model.setSsn("111111111");
    personModel.put("mari", model);
  }

  private void setupAhd() {
    ahdModel = new AHDModel();
    ahdModel.setCompanyName("Cdog Health Ltd.");
    ahdModel.setSendingApplicationName("Cdog Health Ltd.");
    ahdModel.setSendingApplicationCode("6CF049DB5F02");
    ahdModel.setSendingApplicationFormat("EUI-64");
  }
}
