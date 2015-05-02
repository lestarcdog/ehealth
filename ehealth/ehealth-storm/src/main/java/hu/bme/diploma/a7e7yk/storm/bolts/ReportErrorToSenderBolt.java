package hu.bme.diploma.a7e7yk.storm.bolts;

import hu.bme.diploma.a7e7yk.converters.hl7converter.HapiHl7Parser;
import hu.bme.diploma.a7e7yk.storm.StormFieldsConstants;
import hu.bme.diploma.a7e7yk.storm.rabbitmq.RabbitMqPublisher;

import java.io.IOException;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import backtype.storm.task.OutputCollector;
import backtype.storm.task.TopologyContext;
import backtype.storm.topology.OutputFieldsDeclarer;
import backtype.storm.topology.base.BaseRichBolt;
import backtype.storm.tuple.Tuple;
import ca.uhn.hl7v2.HL7Exception;

public class ReportErrorToSenderBolt extends BaseRichBolt {
  private static final long serialVersionUID = 6431541012110777124L;

  private final Logger logger = LoggerFactory.getLogger(ReportErrorToSenderBolt.class);

  private OutputCollector collector;
  private RabbitMqPublisher rabbitMqPublisher;
  private HapiHl7Parser parser;

  @Override
  public void prepare(Map stormConf, TopologyContext context, OutputCollector collector) {
    this.collector = collector;
    try {
      rabbitMqPublisher = new RabbitMqPublisher();
      parser = new HapiHl7Parser();
    } catch (IOException e) {
      logger.error("Cant create ReportToSenderBolt bolt", e);
      throw new RuntimeException(e);
    }

  }

  @Override
  public void execute(Tuple input) {
    collector.ack(input);
    Object errorObject = input.getValueByField(StormFieldsConstants.ERROR_FIELD);
    String senderId = (String) input.getValueByField(StormFieldsConstants.SENDER_ID_FIELD);
    try {
      if (errorObject != null) {
        HL7Exception exception = (HL7Exception) errorObject;
        rabbitMqPublisher.publishToUserQueue(senderId, exception.getMessage().getBytes());
      }
    } catch (Exception e) {
      logger.error("Can't send message to user", e);
    }
  }

  @Override
  public void declareOutputFields(OutputFieldsDeclarer declarer) {}

  @Override
  public void cleanup() {
    rabbitMqPublisher.close();
    super.cleanup();
  }

}
