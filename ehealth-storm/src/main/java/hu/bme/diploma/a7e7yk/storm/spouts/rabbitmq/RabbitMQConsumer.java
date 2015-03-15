package hu.bme.diploma.a7e7yk.storm.spouts.rabbitmq;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.ConsumerCancelledException;
import com.rabbitmq.client.QueueingConsumer;
import com.rabbitmq.client.ShutdownSignalException;

public class RabbitMQConsumer {

  private static final Logger LOG = LoggerFactory.getLogger(RabbitMQConsumer.class);

  private static final String RMQ_USERNAME = "";
  private static final String RMQ_PASS = "";
  private static final String QUEUE_NAME = "ehealth.publish";
  private static final boolean REQUEUE = true;

  private ConnectionFactory factory;
  private Channel channel;
  private Connection connection;
  private QueueingConsumer consumer;

  public RabbitMQConsumer(String host, int port) throws IOException {
    factory = new ConnectionFactory();
    factory.setHost(host);;
    factory.setPort(port);
    factory.setUsername(RMQ_USERNAME);
    factory.setPassword(RMQ_PASS);
    connection = factory.newConnection();
    channel = connection.createChannel();
    consumer = new QueueingConsumer(channel);
    channel.basicConsume(QUEUE_NAME, false, consumer);
  }

  public String consume() throws IOException, ShutdownSignalException, ConsumerCancelledException,
      InterruptedException {
    QueueingConsumer.Delivery delivery = consumer.nextDelivery();
    String message = new String(delivery.getBody());
    return message;

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
}
