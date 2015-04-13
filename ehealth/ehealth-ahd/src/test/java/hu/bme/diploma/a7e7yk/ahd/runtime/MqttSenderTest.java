package hu.bme.diploma.a7e7yk.ahd.runtime;

import hu.bme.diploma.a7e7yk.ahd.mqttclient.MqttCommunicatorBlocking;

import org.junit.Test;

public class MqttSenderTest {

  @Test
  public void blockRabbitMq() throws Exception {
    MqttCommunicatorBlocking s = new MqttCommunicatorBlocking("jozsi", "jozsi");
    System.out.println("---send----");
    s.sendMessage("valami2".getBytes());
    System.out.println("---recieve----");
    System.out.println(new String(s.receive()));
    s.disconnect();
  }
}
