package nettosphere;

import hu.bme.diploma.a7e7yk.constants.EhealthConstants;
import hu.bme.diploma.a7e7yk.converters.RealTimeDtoConverter;
import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.BloodPressureVitalSign;
import hu.bme.diploma.a7e7yk.dtos.RealtimeMeasurementDto;
import hu.bme.diploma.a7e7yk.exceptions.EhealthException;
import hu.bme.diploma.a7e7yk.healthrules.DecisionSupport;
import hu.bme.diploma.a7e7yk.storm.realtime.RealtimeMessageBroker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.Random;

import org.junit.Test;

public class RealtimeBrokerTest {

  private Random rand = new Random();
  private static final String userId = "patient1";

  // @Test
  public void runServerAndSendBloodpressureVitalSign() throws IOException, InterruptedException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    while (true) {
      // br.readLine();
      Thread.sleep(1000);
      RealtimeMessageBroker.get().sendMessageToObservers(generateBloodpressureVitalSign());
    }
    // s.close();
  }

  @Test
  public void highBloodPressureDecision() throws EhealthException {
    RealtimeMessageBroker.get();

    BloodPressureVitalSign v = new BloodPressureVitalSign();
    v.setMeasurementTime(ZonedDateTime.now());
    v.getSystolic().setValue(180.0);

    DecisionSupport.get().getSession("jozsi").addVitalSigns(Arrays.asList(v));

  }

  private RealtimeMeasurementDto generateBloodpressureVitalSign() {
    RealtimeMeasurementDto dto = new RealtimeMeasurementDto();
    long millis = ZonedDateTime.now().toInstant().toEpochMilli();
    ZonedDateTime mtime =
        ZonedDateTime.ofInstant(Instant.ofEpochSecond(millis),
            EhealthConstants.DEFAULT_BUDAPEST_ZONEID);
    dto.setTimeInMillis(millis);

    BloodPressureVitalSign v = new BloodPressureVitalSign();
    v.setMeasurementTime(mtime);
    v.getDiastolic().setValue((double) rand.nextInt(50) + 70);
    v.getSystolic().setValue((double) rand.nextInt(90) + 70);
    v.getPulseRate().setValue((double) rand.nextInt(40) + 40);
    return RealTimeDtoConverter.convert2Measurement(v, userId);
  }
}
