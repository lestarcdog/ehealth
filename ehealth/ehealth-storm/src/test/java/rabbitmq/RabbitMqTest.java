package rabbitmq;

import hu.bme.diploma.a7e7yk.constants.EhealthConstants;
import hu.bme.diploma.a7e7yk.storm.rabbitmq.RabbitMqConsumer;
import hu.bme.diploma.a7e7yk.storm.rabbitmq.RabbitMqConsumer.RabbitMqMessage;
import hu.bme.diploma.a7e7yk.storm.rabbitmq.RabbitMqPublisher;

import java.io.IOException;

import org.junit.Test;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class RabbitMqTest {

  RabbitMqConsumer consumer;
  RabbitMqPublisher publisher;

  public RabbitMqTest() throws IOException {
    consumer = new RabbitMqConsumer();
    publisher = new RabbitMqPublisher();
  }

  @Test
  public void consumeMessage() throws Exception {
    RabbitMqMessage m = consumer.consume();
    System.out.println(m);
  }

  // @Test
  public void amqTest() throws IOException {
    ConnectionFactory factory;
    Channel channel;
    Connection connection;
    factory = new ConnectionFactory();
    factory.setHost(EhealthConstants.RABBITMQ_SERVER_ADDR);
    factory.setPort(EhealthConstants.RABBITMQ_AMQP_PORT);
    factory.setUsername("admin");
    factory.setPassword("admin");
    connection = factory.newConnection();
    channel = connection.createChannel();
    channel.basicPublish("amq.direct", "test", null, "lofasz".getBytes());
    channel.close();
    connection.close();
  }

}
