package nettosphere;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.atmosphere.cpr.AtmosphereResource;
import org.atmosphere.nettosphere.Config;
import org.atmosphere.nettosphere.Handler;
import org.atmosphere.nettosphere.Nettosphere;
import org.junit.Test;

public class NettoSphereTest {


  @Test
  public void testRunServer() throws IOException {
    Nettosphere server =
        new Nettosphere.Builder().config(
            new Config.Builder().host("127.0.0.1").port(9090).resource("/test", new Handler() {

              @Override
              public void handle(AtmosphereResource r) {
                try {
                  r.getResponse().write("Hello World").write(" from Nettosphere").flushBuffer();
                } catch (IOException e) {
                  e.printStackTrace();
                }
              }
            }).build()).build();
    server.start();
    String a = "";
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    while (!(a.equals("quit"))) {
      a = br.readLine();
    }
    System.exit(-1);
  }
}
