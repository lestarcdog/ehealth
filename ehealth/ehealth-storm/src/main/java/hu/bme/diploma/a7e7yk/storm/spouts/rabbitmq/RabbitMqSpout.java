package hu.bme.diploma.a7e7yk.storm.spouts.rabbitmq;

import hu.bme.diploma.a7e7yk.storm.spouts.rabbitmq.RabbitMqConsumer.RabbitMqMessage;

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

  private static final Logger LOG = LoggerFactory.getLogger(RabbitMqSpout.class);
  public static final Fields OUTPUT_FIELDS = new Fields("ContinuaMsg");

  private SpoutOutputCollector collector;
  private final RabbitMqConsumer consumer;

  public RabbitMqSpout() throws IOException {
    consumer = new RabbitMqConsumer();
  }

  @Override
  public void open(Map conf, TopologyContext context, SpoutOutputCollector collector) {
    this.collector = collector;

  }

  @Override
  public void nextTuple() {
    try {
      RabbitMqMessage msg;
      msg = consumer.consume();
      collector.emit(Arrays.asList(msg.msg), msg.deliveryTag);
    } catch (ShutdownSignalException | ConsumerCancelledException | IOException
        | InterruptedException e) {
      LOG.debug(null, e);
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
    // TODO Auto-generated method stub
    super.ack(msgId);
  }

  @Override
  public void fail(Object msgId) {
    // TODO Auto-generated method stub
    super.fail(msgId);
  }



}
