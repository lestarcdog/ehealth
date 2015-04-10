package hu.bme.diploma.a7e7yk.ahd.runtime;

import java.nio.charset.Charset;

import org.fusesource.mqtt.client.BlockingConnection;
import org.fusesource.mqtt.client.MQTT;
import org.fusesource.mqtt.client.QoS;
import org.fusesource.mqtt.client.Topic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MqttCommunicator {
  private final Logger _l = LoggerFactory.getLogger(getClass());
  private final static String host = "127.0.0.1";
  private final static int port = 1883;

  private final String username;
  private final String password;
  private BlockingConnection connection;
  private static final String PUBLICH_TOPIC_NAME = "ehealth.publish";
  private static final Charset UTF_8_CHARSET = Charset.forName("UTF-8");

  private final Topic[] topics;

  public MqttCommunicator(String username, String password) throws Exception {
    this.username = username;
    this.password = password;
    MQTT mqtt = new MQTT();
    mqtt.setHost(host, port);
    mqtt.setClientId(username);
    mqtt.setUserName(username);
    mqtt.setPassword(password);
    topics = new Topic[] {new Topic(username, QoS.AT_LEAST_ONCE)};

    connection = mqtt.blockingConnection();
    // connection.subscribe(topics);
    System.out.println("before connect");
    connection.connect();
    System.out.println("after connect");
  }


  public void sendMessage(String message) throws Exception {
    System.out.println("sending message");
    connection.publish(PUBLICH_TOPIC_NAME, message.getBytes(), QoS.AT_LEAST_ONCE, false);
  }

  public String recieveMessage() throws Exception {
    return new String(connection.receive().getPayload(), UTF_8_CHARSET);
  }

  public void disconnect() throws Exception {
    connection.disconnect();
  }
}
