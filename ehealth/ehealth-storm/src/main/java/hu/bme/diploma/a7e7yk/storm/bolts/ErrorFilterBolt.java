package hu.bme.diploma.a7e7yk.storm.bolts;

import hu.bme.diploma.a7e7yk.storm.StormFieldsConstants;

import java.util.Map;

import backtype.storm.task.OutputCollector;
import backtype.storm.task.TopologyContext;
import backtype.storm.topology.OutputFieldsDeclarer;
import backtype.storm.topology.base.BaseRichBolt;
import backtype.storm.tuple.Fields;
import backtype.storm.tuple.Tuple;

public class ErrorFilterBolt extends BaseRichBolt {

  public ErrorFilterBolt() {
    // TODO Auto-generated constructor stub
  }

  @Override
  public void prepare(Map stormConf, TopologyContext context, OutputCollector collector) {
    // TODO Auto-generated method stub

  }

  @Override
  public void execute(Tuple input) {
    // TODO Auto-generated method stub

  }

  @Override
  public void declareOutputFields(OutputFieldsDeclarer declarer) {
    declarer.declare(new Fields(StormFieldsConstants.USER_ID_FIELD, StormFieldsConstants.MEASUREMENTS_FIELD));
  }

}
