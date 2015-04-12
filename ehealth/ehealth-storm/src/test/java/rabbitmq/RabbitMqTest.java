package rabbitmq;

import hu.bme.diploma.a7e7yk.constants.EhealthConstants;
import hu.bme.diploma.a7e7yk.storm.rabbitmq.AbstractRabbitMq.RabbitMqMessage;
import hu.bme.diploma.a7e7yk.storm.rabbitmq.RabbitMqConsumer;
import hu.bme.diploma.a7e7yk.storm.rabbitmq.RabbitMqPublisher;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

public class RabbitMqTest {

  RabbitMqConsumer consumer;
  RabbitMqPublisher publisher;

  public RabbitMqTest() throws IOException {
    consumer = new RabbitMqConsumer();
    publisher = new RabbitMqPublisher();
  }

  @Test
  public void consumeMessage() throws Exception {
    publisher.publish("ehealth.publish", "jozsi-test", "this is sparta".getBytes());
    RabbitMqMessage m = consumer.consume();
    Assert.assertNotNull(m);
    Assert.assertEquals("jozsi-test", m.getSenderId());
    Assert.assertEquals("this is sparta", m.getMsg());
    consumer.ack(m.getDeliveryTag());
  }

  @Test
  public void publishMessageToSenderTopic() throws IOException {
    String queueName =
        EhealthConstants.RABBITMQ_SENDERSUBSCRIPTION_TEMPLATE.replace(
            EhealthConstants.RABBITMQ_SENDERSUBSCRIPTION_TEMPLATE_VAR1, "jozsi");
    publisher.publishToUserQueue("jozsi", "test-message".getBytes());
    RabbitMqMessage m = consumer.consumeFromQueue(queueName);
    Assert.assertEquals("test-message", m.getMsg());
    consumer.ack(m.getDeliveryTag());
  }


}
