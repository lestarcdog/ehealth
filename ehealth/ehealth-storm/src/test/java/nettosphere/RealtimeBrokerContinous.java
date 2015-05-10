package nettosphere;

import hu.bme.diploma.a7e7yk.constants.EhealthConstants;
import hu.bme.diploma.a7e7yk.converters.RealTimeDtoConverter;
import hu.bme.diploma.a7e7yk.datamodel.enums.RealtimeDecisionMessagePriority;
import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.BloodPressureVitalSign;
import hu.bme.diploma.a7e7yk.dtos.RealtimeDecisionDto;
import hu.bme.diploma.a7e7yk.dtos.RealtimeMeasurementDto;
import hu.bme.diploma.a7e7yk.storm.realtime.RealtimeMessageBroker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.util.Random;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RealtimeBrokerContinous {

  private static final Logger logger = LoggerFactory.getLogger(RealtimeBrokerContinous.class);

  private Random rand = new Random();
  private static final String userId = "123456789";

  @Test
  public void runServerAndSendBloodpressureVitalSign() throws IOException, InterruptedException {
    RealtimeMessageBroker.get();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int i = 0;
    Thread.sleep(10000);
    while (i < 13) {
      // br.readLine();
      i++;
      Thread.sleep(2000);
      RealtimeMessageBroker.get().sendMessageToObservers(generateBloodpressureVitalSign());
    }
    RealtimeDecisionDto dto = new RealtimeDecisionDto();
    dto.setMessage("Hypertension");
    dto.setPriority(RealtimeDecisionMessagePriority.MEDIUM);
    dto.setSsn("123456789");
    dto.setTimeInMillis(ZonedDateTime.now().toInstant().toEpochMilli());
    RealtimeMessageBroker.get().sendMessageToObservers(dto);
  }

  @Test
  public void runServerAndSendDecisions() throws InterruptedException {
    RealtimeMessageBroker.get();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    while (true) {
      // br.readLine();
      Thread.sleep(5000);
      logger.info("sending decision");
      RealtimeDecisionDto dto = new RealtimeDecisionDto();
      dto.setMessage("this is message");
      dto.setPriority(RealtimeDecisionMessagePriority.HIGH);
      dto.setSsn("123456789");
      dto.setTimeInMillis(ZonedDateTime.now().toInstant().toEpochMilli());

      RealtimeMessageBroker.get().sendMessageToObservers(dto);
    }
  }


  private RealtimeMeasurementDto generateBloodpressureVitalSign() {
    RealtimeMeasurementDto dto = new RealtimeMeasurementDto();
    long millis = ZonedDateTime.now().toInstant().toEpochMilli();
    ZonedDateTime mtime =
        ZonedDateTime.ofInstant(Instant.ofEpochMilli(millis), EhealthConstants.DEFAULT_BUDAPEST_ZONEID);
    dto.setTimeInMillis(millis);

    BloodPressureVitalSign v = new BloodPressureVitalSign();
    v.setMeasurementTime(mtime);
    v.getDiastolic().setValue((double) rand.nextInt(50) + 70);
    v.getSystolic().setValue((double) rand.nextInt(90) + 70);
    v.getPulseRate().setValue((double) rand.nextInt(40) + 40);
    return RealTimeDtoConverter.convert2Measurement(v, userId);
  }
}
