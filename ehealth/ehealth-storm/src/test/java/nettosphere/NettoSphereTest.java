package nettosphere;

import hu.bme.diploma.a7e7yk.storm.nettosphere.data.RealTimeDataDto;
import hu.bme.diploma.a7e7yk.storm.nettosphere.handler.RealTimeDataWsHandler;
import hu.bme.diploma.a7e7yk.storm.nettosphere.handler.WebSocketRegistry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.ZonedDateTime;

import org.atmosphere.nettosphere.Config;
import org.atmosphere.nettosphere.Nettosphere;
import org.junit.Test;

public class NettoSphereTest {


  @Test
  public void testRunServer() throws IOException {
    Config.Builder conf =
        new Config.Builder().host("127.0.0.1").port(9090).resource(RealTimeDataWsHandler.class);

    Nettosphere server = new Nettosphere.Builder().config(conf.build()).build();
    WebSocketRegistry.init(server.framework());
    server.start();
    String a = "";
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    RealTimeDataDto dto;
    while (!(a.equals("quit"))) {
      a = br.readLine();
      dto = new RealTimeDataDto("1", ZonedDateTime.now().toInstant().toEpochMilli(), null);
      dto.setValue(Double.valueOf(a));
      WebSocketRegistry.get().sendMessageToId(dto, "jozsi");
    }
    System.exit(-1);
  }
}
