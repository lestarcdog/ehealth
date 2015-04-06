package nettosphere;

import hu.bme.diploma.a7e7yk.storm.nettosphere.handler.RealTimeDataWsHandler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.atmosphere.nettosphere.Config;
import org.atmosphere.nettosphere.Nettosphere;
import org.junit.Test;

public class NettoSphereTest {


  @Test
  public void testRunServer() throws IOException {
    Config.Builder conf =
        new Config.Builder().host("127.0.0.1").port(9090).resource(RealTimeDataWsHandler.class);

    Nettosphere server = new Nettosphere.Builder().config(conf.build()).build();
    server.start();
    String a = "";
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    while (!(a.equals("quit"))) {
      a = br.readLine();
    }
    System.exit(-1);
  }
}
