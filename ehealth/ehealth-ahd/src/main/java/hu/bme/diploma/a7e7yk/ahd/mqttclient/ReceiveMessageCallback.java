package hu.bme.diploma.a7e7yk.ahd.mqttclient;

import org.fusesource.hawtbuf.Buffer;
import org.fusesource.hawtbuf.UTF8Buffer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReceiveMessageCallback implements IMqttMessageRecieveCallback {
  private final Logger logger = LoggerFactory.getLogger(ReceiveMessageCallback.class);

  @Override
  public void receive(Buffer message) {
    String msg = UTF8Buffer.decode(message);
    logger.info(msg);

  }

}
