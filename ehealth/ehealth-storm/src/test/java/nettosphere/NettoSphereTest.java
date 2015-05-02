package nettosphere;

import hu.bme.diploma.a7e7yk.constants.EhealthConstants;
import hu.bme.diploma.a7e7yk.converters.RealTimeDtoConverter;
import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.BloodPressureVitalSign;
import hu.bme.diploma.a7e7yk.dtos.RealTimeDataDto;
import hu.bme.diploma.a7e7yk.storm.nettosphere.server.NettoSphereServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.util.Random;

import org.junit.Test;

public class NettoSphereTest {

  private Random rand = new Random();
  private static final String userId = "patient1";

  @Test
  public void runServerAndSendBloodpressureVitalSign() throws IOException, InterruptedException {
    NettoSphereServer s = new NettoSphereServer();
    System.err.println("Server started");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    while (true) {
      // br.readLine();
      Thread.sleep(1000);
      s.sendMessageToObservers(generateBloodpressureVitalSign());
    }
    // s.close();
  }


  private RealTimeDataDto generateBloodpressureVitalSign() {
    RealTimeDataDto dto = new RealTimeDataDto();
    long seconds = ZonedDateTime.now().toInstant().getEpochSecond();
    ZonedDateTime mtime =
        ZonedDateTime.ofInstant(Instant.ofEpochSecond(seconds), EhealthConstants.DEFAULT_BUDAPEST_ZONEID);
    dto.setTime(seconds);

    BloodPressureVitalSign v = new BloodPressureVitalSign();
    v.setMeasurementTime(mtime);
    v.getDiastolic().setValue((double) rand.nextInt(50) + 70);
    v.getSystolic().setValue((double) rand.nextInt(90) + 70);
    v.getPulseRate().setValue((double) rand.nextInt(40) + 40);
    return RealTimeDtoConverter.convert(v, userId);
  }
}
