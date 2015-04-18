package hu.bme.diploma.a7e7yk.storm.spouts.rabbitmq;

import hu.bme.diploma.a7e7yk.storm.StormFieldsConstants;
import hu.bme.diploma.a7e7yk.storm.rabbitmq.AbstractRabbitMq.RabbitMqMessage;
import hu.bme.diploma.a7e7yk.storm.rabbitmq.RabbitMqConsumer;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import backtype.storm.spout.SpoutOutputCollector;
import backtype.storm.task.TopologyContext;
import backtype.storm.topology.OutputFieldsDeclarer;
import backtype.storm.topology.base.BaseRichSpout;
import backtype.storm.tuple.Fields;

import com.rabbitmq.client.ConsumerCancelledException;
import com.rabbitmq.client.ShutdownSignalException;

public class RabbitMqSpout extends BaseRichSpout {

  private static final long serialVersionUID = 7843454057101302500L;

  private static final Logger logger = LoggerFactory.getLogger(RabbitMqSpout.class);
  public static final Fields OUTPUT_FIELDS = new Fields(StormFieldsConstants.SENDER_ID_FIELD,
      StormFieldsConstants.UNPARSED_CONTINUA_MSG_FIELD);

  private SpoutOutputCollector collector;
  private RabbitMqConsumer consumer;

  @Override
  public void open(Map conf, TopologyContext context, SpoutOutputCollector collector) {
    try {
      consumer = new RabbitMqConsumer();
      consumer.init();
    } catch (IOException e) {
      collector.reportError(e);
    }

    this.collector = collector;

  }

  @Override
  public void nextTuple() {
    try {
      RabbitMqMessage msg;
      msg = consumer.consume();
      logger.debug("Reading message from {}", msg.getSenderId());
      collector.emit(Arrays.asList(msg.getSenderId(), msg.getMsg()), msg.getDeliveryTag());
    } catch (ShutdownSignalException | ConsumerCancelledException | IOException | InterruptedException e) {
      logger.error(null, e);
      collector.reportError(e);
    }
  }

  @Override
  public void declareOutputFields(OutputFieldsDeclarer declarer) {
    declarer.declare(OUTPUT_FIELDS);

  }

  @Override
  public void close() {
    consumer.close();
    super.close();
  }

  @Override
  public void ack(Object msgId) {
    consumer.ack((Long) msgId);
    super.ack(msgId);
  }

  @Override
  public void fail(Object msgId) {
    super.fail(msgId);
  }



}
