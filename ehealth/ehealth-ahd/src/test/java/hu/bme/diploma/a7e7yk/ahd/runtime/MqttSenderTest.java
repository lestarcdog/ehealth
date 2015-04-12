package hu.bme.diploma.a7e7yk.ahd.runtime;

import hu.bme.diploma.a7e7yk.mqttclient.MqttCommunicatorBlocking;
import hu.bme.diploma.a7e7yk.mqttclient.MqttCommunicatorCallback;
import hu.bme.diploma.a7e7yk.mqttclient.ReceiveMessageCallback;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.junit.Test;

public class MqttSenderTest {

  // @Test
  public void callRabbitMq() throws Exception {
    MqttCommunicatorCallback s =
        new MqttCommunicatorCallback("jozsi", "jozsi", new ReceiveMessageCallback());
    s.sendMessage("valami2".getBytes());
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    br.readLine();
    s.disconnect();
  }

  @Test
  public void blockRabbitMq() throws Exception {
    MqttCommunicatorBlocking s = new MqttCommunicatorBlocking("jozsi", "jozsi");
    s.sendMessage("valami2".getBytes());
    System.out.println(new String(s.recieve()));
    s.disconnect();
  }
}
