package hu.bme.diploma.a7e7yk.ahd.runtime;

import org.junit.Test;

public class MqttSenderTest {

  @Test
  public void callRabbitMq() throws Exception {
    MqttCommunicator s = new MqttCommunicator("guest", "guest");
    s.sendMessage("valami sadf asdf fasd ");
    s.disconnect();
  }
}
