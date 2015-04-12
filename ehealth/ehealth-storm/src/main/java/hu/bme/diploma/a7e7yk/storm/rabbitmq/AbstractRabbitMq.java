package hu.bme.diploma.a7e7yk.storm.rabbitmq;

import hu.bme.diploma.a7e7yk.constants.EhealthConstants;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public abstract class AbstractRabbitMq {

  protected static final Logger logger = LoggerFactory.getLogger(RabbitMqConsumer.class);
  private static final String RMQ_USERNAME = "admin";
  private static final String RMQ_PASS = "admin";

  protected ConnectionFactory factory;
  protected Channel channel;
  protected Connection connection;

  public AbstractRabbitMq() throws IOException {
    factory = new ConnectionFactory();
    factory.setHost(EhealthConstants.RABBITMQ_SERVER_ADDR);
    factory.setPort(EhealthConstants.RABBITMQ_AMQP_PORT);
    factory.setUsername(RMQ_USERNAME);
    factory.setPassword(RMQ_PASS);
    connection = factory.newConnection();
    channel = connection.createChannel();
  }

  public void close() {
    try {
      channel.close();
      connection.close();
    } catch (IOException e) {
      logger.error(null, e);
    }
  }

  /**
   * Dto class for rabbitMq messages fields.
   */
  public static class RabbitMqMessage {
    private long deliveryTag;
    private String msg;
    private String senderId;

    public RabbitMqMessage() {}

    public RabbitMqMessage(long deliveryTag, String msg, String senderId) {
      super();
      this.deliveryTag = deliveryTag;
      this.msg = msg;
      this.senderId = senderId;
    }

    public long getDeliveryTag() {
      return deliveryTag;
    }

    public void setDeliveryTag(long deliveryTag) {
      this.deliveryTag = deliveryTag;
    }

    public String getMsg() {
      return msg;
    }

    public void setMsg(String msg) {
      this.msg = msg;
    }

    public String getSenderId() {
      return senderId;
    }

    public void setSenderId(String senderId) {
      this.senderId = senderId;
    }

    @Override
    public String toString() {
      return "RabbitMqMessage [deliveryTag=" + deliveryTag + ", msg=" + msg + ", senderId="
          + senderId + "]";
    }
  }

}
