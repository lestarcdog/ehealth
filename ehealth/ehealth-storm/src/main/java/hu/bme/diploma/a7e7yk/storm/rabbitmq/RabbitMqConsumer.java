package hu.bme.diploma.a7e7yk.storm.rabbitmq;

import hu.bme.diploma.a7e7yk.constants.EhealthConstants;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.ConsumerCancelledException;
import com.rabbitmq.client.QueueingConsumer;
import com.rabbitmq.client.ShutdownSignalException;

public class RabbitMqConsumer {

  private static final Logger logger = LoggerFactory.getLogger(RabbitMqConsumer.class);
  private String RMQ_USERNAME = "admin";
  private String RMQ_PASS = "admin";

  private ConnectionFactory factory;
  private Channel channel;
  private Connection connection;
  private QueueingConsumer consumer;

  public RabbitMqConsumer() throws IOException {
    factory = new ConnectionFactory();
    factory.setHost(EhealthConstants.RABBITMQ_SERVER_ADDR);
    factory.setPort(EhealthConstants.RABBITMQ_AMQP_PORT);
    factory.setUsername(RMQ_USERNAME);
    factory.setPassword(RMQ_PASS);
    connection = factory.newConnection();
    channel = connection.createChannel();
    consumer = new QueueingConsumer(channel);
    channel.basicConsume(EhealthConstants.RABBITMQ_QUEUE_NAME, false, consumer);
  }

  public RabbitMqMessage consume() throws IOException, ShutdownSignalException,
      ConsumerCancelledException, InterruptedException {
    QueueingConsumer.Delivery delivery = consumer.nextDelivery();
    RabbitMqMessage m = new RabbitMqMessage();
    m.setSenderId(delivery.getProperties().getUserId());
    m.setDeliveryTag(delivery.getEnvelope().getDeliveryTag());
    m.setMsg(new String(delivery.getBody(), EhealthConstants.UTF8_CHARSET));
    return m;
  }

  public void ack(Long deliveryTag) {
    try {
      channel.basicAck(deliveryTag, false);
    } catch (IOException e) {
      logger.error("Can't ack the message.", e);
    }
  }

  public void fail(Long deliveryTag) {
    try {
      channel.basicNack(deliveryTag, false, EhealthConstants.RABBITMQ_REQUEUE);
    } catch (IOException e) {
      logger.error("Can't ack the fail message.", e);
    }
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


  }
}
