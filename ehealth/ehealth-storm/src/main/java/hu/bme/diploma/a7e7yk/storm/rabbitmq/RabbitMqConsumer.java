package hu.bme.diploma.a7e7yk.storm.rabbitmq;

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

  private static final Logger LOG = LoggerFactory.getLogger(RabbitMqConsumer.class);
  private String RMQ_USERNAME = "admin";
  private String RMQ_PASS = "admin";
  private String QUEUE_NAME = "ehealth.publish";
  private String HOST = "127.0.0.1";
  private int PORT = 9999;
  private boolean REQUEUE = true;

  private ConnectionFactory factory;
  private Channel channel;
  private Connection connection;
  private QueueingConsumer consumer;

  public RabbitMqConsumer() throws IOException {
    factory = new ConnectionFactory();
    factory.setHost(HOST);
    factory.setPort(PORT);
    factory.setUsername(RMQ_USERNAME);
    factory.setPassword(RMQ_PASS);
    connection = factory.newConnection();
    channel = connection.createChannel();
    consumer = new QueueingConsumer(channel);
    channel.basicConsume(QUEUE_NAME, false, consumer);
  }

  public RabbitMqMessage consume() throws IOException, ShutdownSignalException,
      ConsumerCancelledException, InterruptedException {
    QueueingConsumer.Delivery delivery = consumer.nextDelivery();
    RabbitMqMessage m = new RabbitMqMessage();
    m.deliveryTag = delivery.getEnvelope().getDeliveryTag();
    m.msg = new String(delivery.getBody());
    return m;
  }

  public void ack(Long deliveryTag) throws IOException {
    channel.basicAck(deliveryTag, false);
  }

  public void fail(Long deliveryTag) throws IOException {
    channel.basicNack(deliveryTag, false, REQUEUE);
  }

  public void close() {
    try {
      channel.close();
      connection.close();
    } catch (IOException e) {
      LOG.error(null, e);
    }
  }

  public class RabbitMqMessage {
    public long deliveryTag;
    public String msg;
  }
}