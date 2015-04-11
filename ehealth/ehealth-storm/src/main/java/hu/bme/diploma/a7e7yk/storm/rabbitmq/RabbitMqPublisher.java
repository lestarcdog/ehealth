package hu.bme.diploma.a7e7yk.storm.rabbitmq;

import hu.bme.diploma.a7e7yk.constants.EhealthConstants;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class RabbitMqPublisher {

  private static final Logger LOG = LoggerFactory.getLogger(RabbitMqPublisher.class);
  private static final String RMQ_USERNAME = "admin";
  private static final String RMQ_PASS = "admin";


  private ConnectionFactory factory;
  private Channel channel;
  private Connection connection;

  public RabbitMqPublisher() throws IOException {
    factory = new ConnectionFactory();
    factory.setHost(EhealthConstants.RABBITMQ_SERVER_ADDR);
    factory.setPort(EhealthConstants.RABBITMQ_AMQP_PORT);
    factory.setUsername(RMQ_USERNAME);
    factory.setPassword(RMQ_PASS);
    connection = factory.newConnection();
    channel = connection.createChannel();
  }

  public void publish(String senderId, byte[] message) throws IOException {
    String exchange =
        EhealthConstants.RABBITMQ_SENDERSUBSCRIPTION_TEMPLATE.replace(
            EhealthConstants.RABBITMQ_SENDERSUBSCRIPTION_TEMPLATE_VAR1, senderId);
    channel.basicPublish(exchange, senderId, null, message);
  }

  public void ack(Long deliveryTag) throws IOException {
    channel.basicAck(deliveryTag, false);
  }

  public void fail(Long deliveryTag) throws IOException {
    channel.basicNack(deliveryTag, false, EhealthConstants.RABBITMQ_REQUEUE);
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
