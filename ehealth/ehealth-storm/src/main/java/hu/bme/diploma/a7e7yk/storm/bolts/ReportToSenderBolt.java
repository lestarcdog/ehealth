package hu.bme.diploma.a7e7yk.storm.bolts;

import hu.bme.diploma.a7e7yk.storm.StormFieldsConstants;

import java.util.Map;

import backtype.storm.task.OutputCollector;
import backtype.storm.task.TopologyContext;
import backtype.storm.topology.OutputFieldsDeclarer;
import backtype.storm.topology.base.BaseRichBolt;
import backtype.storm.tuple.Tuple;
import ca.uhn.hl7v2.HL7Exception;

public class ReportToSenderBolt extends BaseRichBolt {

  private OutputCollector collector;

  @Override
  public void prepare(Map stormConf, TopologyContext context, OutputCollector collector) {
    this.collector = collector;

  }

  @Override
  public void execute(Tuple input) {
    collector.ack(input);
    Object errorObject = input.getValueByField(StormFieldsConstants.ERROR_FIELD);
    if (errorObject == null) {
      // TODO send ack messag to rabbit mq
    } else {
      HL7Exception exception = (HL7Exception) errorObject;
      // TODO send fail message to rabbit mq

    }

  }

  @Override
  public void declareOutputFields(OutputFieldsDeclarer declarer) {}

}
