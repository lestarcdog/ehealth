package hu.bme.diploma.a7e7yk.storm.bolts;

import hu.bme.diploma.a7e7yk.converters.hl7converter.HapiHl7Parser;
import hu.bme.diploma.a7e7yk.storm.StormConstants;
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
import ca.uhn.hl7v2.model.v26.message.ORU_R01;

public class ReportToSenderBolt extends BaseRichBolt {
  private static final long serialVersionUID = 6431541012110777124L;

  private final Logger logger = LoggerFactory.getLogger(ReportToSenderBolt.class);

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
    String senderId = (String) input.getValueByField(StormConstants.SENDER_ID_FIELD);
    ORU_R01 parsedData =
        (ORU_R01) input.getValueByField(StormConstants.PARSED_CONTINUA_MSG_FIELD);
    try {
      if (parsedData != null) {
        rabbitMqPublisher.publishToUserQueue(senderId, parser.unparse(parsedData.generateACK())
            .getBytes());
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
