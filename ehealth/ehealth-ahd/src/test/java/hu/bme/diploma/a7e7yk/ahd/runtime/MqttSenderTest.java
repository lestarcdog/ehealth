package hu.bme.diploma.a7e7yk.ahd.runtime;

import hu.bme.diploma.a7e7yk.mqttclient.MqttCommunicatorCallback;
import hu.bme.diploma.a7e7yk.mqttclient.ReceiveMessageCallback;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.junit.Test;

public class MqttSenderTest {

  @Test
  public void callRabbitMq() throws Exception {
    MqttCommunicatorCallback s =
        new MqttCommunicatorCallback("guest", "guest", new ReceiveMessageCallback());
    // s.sendMessage("valami sadf asdf fasd ");

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String a = "";
    while (!(a.equals("quit"))) {
      a = br.readLine();
    }
    s.disconnect();
  }
}
