package nettosphere;

import hu.bme.diploma.a7e7yk.dtos.RealTimeDataDto;
import hu.bme.diploma.a7e7yk.storm.nettosphere.server.NettoSphereServer;

import java.io.IOException;

public class NettoSphereTest {

  // @Test
  public void testRunServer() throws IOException, InterruptedException {
    NettoSphereServer s = new NettoSphereServer();
    Thread.sleep(200);
    s.sendMessageToId(new RealTimeDataDto(), "jozsi");
    Thread.sleep(2000);
  }
}
