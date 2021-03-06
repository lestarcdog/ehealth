package hu.bme.diploma.a7e7yk.ahd.mqttclient;

import org.fusesource.hawtbuf.Buffer;
import org.fusesource.hawtbuf.UTF8Buffer;
import org.fusesource.mqtt.client.Callback;
import org.fusesource.mqtt.client.CallbackConnection;
import org.fusesource.mqtt.client.Listener;
import org.fusesource.mqtt.client.MQTT;
import org.fusesource.mqtt.client.QoS;
import org.fusesource.mqtt.client.Topic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MqttCommunicatorCallback implements IMqttCommunicator {
  private final Logger logger = LoggerFactory.getLogger(getClass());
  private static final String host = "127.0.0.1";
  private static final int port = 1883;

  private final CallbackConnection connection;
  private final IMqttMessageRecieveCallback receiveCallback;
  private final String username;
  private final Topic[] topics;

  public MqttCommunicatorCallback(String username, String password, IMqttMessageRecieveCallback receiveCallback)
      throws Exception {
    this.username = username;
    MQTT mqtt = new MQTT();
    mqtt.setHost(host, port);
    // create durable non-auto deletable topic
    mqtt.setCleanSession(false);
    // rabbmq id
    mqtt.setClientId(username);
    // credentials
    mqtt.setUserName(username);
    mqtt.setPassword(password);
    topics = new Topic[] {new Topic(username, QoS.AT_LEAST_ONCE)};
    this.receiveCallback = receiveCallback;

    connection = mqtt.callbackConnection();
    connection.listener(new ListenerImpl());
    connection.connect(new ConnectionCallback());
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void sendMessage(byte[] message) throws Exception {
    logger.debug("sending message: {}", new String(message));
    connection.publish(username, message, QoS.AT_LEAST_ONCE, false, new PublishCallback());
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void disconnect() {
    connection.disconnect(new EmptyCallback());
  }

  @Override
  public byte[] receive() {
    throw new UnsupportedOperationException("Use callback listener");
  }

  // ---------
  // INNER CLASSES
  // ---------

  /**
   * It does exactly nothing
   *
   */
  private class EmptyCallback implements Callback<Void> {

    @Override
    public void onSuccess(Void value) {}

    @Override
    public void onFailure(Throwable value) {}

  }

  private class PublishCallback implements Callback<Void> {

    @Override
    public void onSuccess(Void value) {
      logger.debug("success");
    }

    @Override
    public void onFailure(Throwable value) {
      logger.debug("fail", value);
    }

  }

  /**
   * Initial connection callback
   *
   */
  private class ConnectionCallback implements Callback<Void> {

    @Override
    public void onSuccess(Void value) {
      connection.subscribe(topics, new Callback<byte[]>() {
        public void onSuccess(byte[] qoses) {
          logger.debug("subscribe success: {}", new String(qoses));
        }

        public void onFailure(Throwable value) {
          logger.error("Subscription is failed. Closing connection");
          MqttCommunicatorCallback.this.disconnect();
        }
      });

    }

    @Override
    public void onFailure(Throwable value) {
      logger.error("Server is not available currently", value);
    }
  }

  /**
   * Callback handler for incoming messages
   */
  private class ListenerImpl implements Listener {

    @Override
    public void onConnected() {}

    @Override
    public void onDisconnected() {}

    @Override
    public void onPublish(UTF8Buffer topic, Buffer body, Runnable ack) {
      try {
        MqttCommunicatorCallback.this.receiveCallback.receive(body);
      } catch (Exception e) {
        logger.warn(null, e);
      }
      ack.run();
    }

    @Override
    public void onFailure(Throwable value) {
      logger.warn("Incoming message error", value);
    }
  }

  @Override
  public String getSenderId() {
    return username;
  }


}
