package hu.bme.diploma.a7e7yk.storm.bolts;

import hu.bme.diploma.a7e7yk.storm.StormFieldsConstants;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import backtype.storm.task.OutputCollector;
import backtype.storm.task.TopologyContext;
import backtype.storm.topology.OutputFieldsDeclarer;
import backtype.storm.topology.base.BaseRichBolt;
import backtype.storm.tuple.Fields;
import backtype.storm.tuple.Tuple;
import backtype.storm.tuple.Values;

public class ErrorFilterBolt extends BaseRichBolt {

  private static final long serialVersionUID = -6453854898995387951L;
  private static final Logger logger = LoggerFactory.getLogger(ErrorFilterBolt.class);
  private OutputCollector collector;

  @Override
  public void prepare(Map stormConf, TopologyContext context, OutputCollector collector) {
    this.collector = collector;
  }

  @Override
  public void execute(Tuple input) {
    collector.ack(input);
    if (input.getValueByField(StormFieldsConstants.ERROR_FIELD) == null) {
      logger.debug("Error filter of {}", input.getValueByField(StormFieldsConstants.ERROR_FIELD));
      collector.emit(new Values(input.getValueByField(StormFieldsConstants.USER_ID_FIELD), input
          .getValueByField(StormFieldsConstants.MEASUREMENTS_FIELD)));
    }
  }

  @Override
  public void declareOutputFields(OutputFieldsDeclarer declarer) {
    declarer.declare(new Fields(StormFieldsConstants.USER_ID_FIELD,
        StormFieldsConstants.MEASUREMENTS_FIELD));
  }

}
