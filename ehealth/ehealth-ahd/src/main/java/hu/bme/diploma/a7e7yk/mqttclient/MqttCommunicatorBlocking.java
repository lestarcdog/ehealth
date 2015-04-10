package hu.bme.diploma.a7e7yk.mqttclient;

import java.nio.charset.Charset;

import org.fusesource.mqtt.client.BlockingConnection;
import org.fusesource.mqtt.client.MQTT;
import org.fusesource.mqtt.client.Message;
import org.fusesource.mqtt.client.QoS;
import org.fusesource.mqtt.client.Topic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MqttCommunicatorBlocking {
  private final Logger logger = LoggerFactory.getLogger(getClass());
  private final static String host = "127.0.0.1";
  private final static int port = 1883;

  private final String username;
  private final String password;
  private BlockingConnection connection;
  private static final String PUBLICH_TOPIC_NAME = "ehealth.publish";
  private static final Charset UTF_8_CHARSET = Charset.forName("UTF-8");

  private final Topic[] topics;

  public MqttCommunicatorBlocking(String username, String password) throws Exception {
    this.username = username;
    this.password = password;
    MQTT mqtt = new MQTT();
    mqtt.setHost(host, port);
    // create durable non-auto deletable topic
    mqtt.setCleanSession(false);
    // rabbmq id
    mqtt.setClientId(username);
    // credemtoaés
    mqtt.setUserName(username);
    mqtt.setPassword(password);
    topics = new Topic[] {new Topic(username, QoS.AT_LEAST_ONCE)};
    connection = mqtt.blockingConnection();
    System.out.println("before connect");
    connection.connect();
    connection.subscribe(topics);
    System.out.println("after connect");
  }


  public void sendMessage(String message) throws Exception {
    connection.publish(PUBLICH_TOPIC_NAME, message.getBytes(), QoS.AT_LEAST_ONCE, false);
  }

  public String recieveMessage() throws Exception {
    Message m = connection.receive();
    String content = new String(connection.receive().getPayload(), UTF_8_CHARSET);
    m.ack();
    return content;
  }

  public void disconnect() throws Exception {
    connection.disconnect();
  }
}
