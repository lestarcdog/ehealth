package hu.bme.diploma.a7e7yk.storm.rabbitmq;

import hu.bme.diploma.a7e7yk.constants.EhealthConstants;

import java.io.IOException;

import com.rabbitmq.client.ConsumerCancelledException;
import com.rabbitmq.client.GetResponse;
import com.rabbitmq.client.QueueingConsumer;
import com.rabbitmq.client.ShutdownSignalException;

public class RabbitMqConsumer extends AbstractRabbitMq {

  private QueueingConsumer consumer;

  public RabbitMqConsumer() throws IOException {
    consumer = new QueueingConsumer(channel);
    channel.basicConsume(EhealthConstants.RABBITMQ_QUEUE_NAME, false, consumer);
  }

  public RabbitMqMessage consume() throws IOException, ShutdownSignalException,
      ConsumerCancelledException, InterruptedException {
    QueueingConsumer.Delivery delivery = consumer.nextDelivery();
    return new RabbitMqMessage(delivery.getEnvelope().getDeliveryTag(), new String(
        delivery.getBody(), EhealthConstants.UTF8_CHARSET), delivery.getEnvelope().getRoutingKey());
  }

  public RabbitMqMessage consumeFromQueue(String queueName) throws IOException {
    GetResponse r = channel.basicGet(queueName, true);
    return new RabbitMqMessage(r.getEnvelope().getDeliveryTag(), new String(r.getBody(),
        EhealthConstants.UTF8_CHARSET), r.getEnvelope().getRoutingKey());
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
}
