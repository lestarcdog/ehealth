package hu.bme.diploma.a7e7yk.storm.rabbitmq;

import hu.bme.diploma.a7e7yk.constants.EhealthConstants;

import java.io.IOException;

public class RabbitMqPublisher extends AbstractRabbitMq {

  public RabbitMqPublisher() throws IOException {}

  public void publishToUserQueue(String senderId, byte[] message) throws IOException {
    String queueName =
        EhealthConstants.RABBITMQ_SENDERSUBSCRIPTION_TEMPLATE.replace(
            EhealthConstants.RABBITMQ_SENDERSUBSCRIPTION_TEMPLATE_VAR1, senderId);
    channel.basicPublish("", queueName, null, message);
  }

  public void publish(String exchangeName, String routineKey, byte[] message) throws IOException {
    channel.basicPublish(exchangeName, routineKey, null, message);
  }
}
