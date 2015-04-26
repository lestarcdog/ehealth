package nettosphere;

import hu.bme.diploma.a7e7yk.constants.EhealthConstants;
import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.BloodPressureVitalSign;
import hu.bme.diploma.a7e7yk.dtos.RealTimeDataDto;
import hu.bme.diploma.a7e7yk.storm.nettosphere.server.NettoSphereServer;

import java.io.IOException;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.util.Random;

import org.junit.Test;

public class NettoSphereTest {

  private Random rand = new Random();

  @Test
  public void runServerAndSendBloodpressureVitalSign() throws IOException, InterruptedException {
    NettoSphereServer s = new NettoSphereServer();
    System.err.println("Server started");
    while (true) {
      System.in.read();
      s.sendMessageToObservers(generateBloodpressureVitalSign());
    }
    // s.close();
  }


  private RealTimeDataDto generateBloodpressureVitalSign() {
    RealTimeDataDto dto = new RealTimeDataDto();
    dto.setSubjectId("patient1");
    dto.setMdcMeasurementId(BloodPressureVitalSign.MDC_VALUE.getId());
    long seconds = ZonedDateTime.now().toInstant().getEpochSecond();
    ZonedDateTime mtime =
        ZonedDateTime.ofInstant(Instant.ofEpochSecond(seconds),
            EhealthConstants.DEFAULT_BUDAPEST_ZONEID);
    dto.setTime(seconds);

    BloodPressureVitalSign v = new BloodPressureVitalSign();
    v.setMeasurementTime(mtime);
    v.getDiastolic().setValue((double) rand.nextInt(50) + 70);
    v.getSystolic().setValue((double) rand.nextInt(90) + 70);
    v.getPulseRate().setValue((double) rand.nextInt(40) + 40);
    dto.setValue(v);
    return dto;

  }
}
