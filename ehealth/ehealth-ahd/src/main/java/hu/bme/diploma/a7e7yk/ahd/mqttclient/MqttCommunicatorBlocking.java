package hu.bme.diploma.a7e7yk.ahd.mqttclient;

import java.util.concurrent.TimeUnit;

import org.fusesource.mqtt.client.BlockingConnection;
import org.fusesource.mqtt.client.MQTT;
import org.fusesource.mqtt.client.Message;
import org.fusesource.mqtt.client.QoS;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MqttCommunicatorBlocking implements IMqttCommunicator {
  private final Logger logger = LoggerFactory.getLogger(getClass());
  private static final String HOST = "127.0.0.1";
  private static final int PORT = 1883;
  private static final int RETRIVE_WAIT_TIMEOUT = 5000;

  private final BlockingConnection connection;
  private final String username;

  public MqttCommunicatorBlocking(String username, String password) throws Exception {
    this.username = username;
    MQTT mqtt = new MQTT();
    mqtt.setHost(HOST, PORT);
    // create durable non-auto deletable topic
    mqtt.setCleanSession(false);
    // rabbmq id
    mqtt.setClientId(username);
    // credentials
    mqtt.setUserName(username);
    mqtt.setPassword(password);
    connection = mqtt.blockingConnection();
    connection.connect();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void sendMessage(byte[] message) throws Exception {
    logger.debug("sending message: {}", new String(message));
    connection.publish(username, message, QoS.AT_LEAST_ONCE, false);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void disconnect() {
    try {
      connection.disconnect();
    } catch (Exception e) {
      logger.error(null, e);
    }
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public byte[] receive() {
    try {
      Message m = connection.receive(RETRIVE_WAIT_TIMEOUT, TimeUnit.MILLISECONDS);
      if (m != null) {
        m.ack();
        return m.getPayload();
      }
    } catch (Exception e) {
      logger.warn(null, e);
    }
    return null;
  }

  @Override
  public String getSenderId() {
    return username;
  }


}
