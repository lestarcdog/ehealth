package hu.bme.diploma.a7e7yk.storm.bolts;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import backtype.storm.task.OutputCollector;
import backtype.storm.task.TopologyContext;
import backtype.storm.topology.OutputFieldsDeclarer;
import backtype.storm.topology.base.BaseRichBolt;
import backtype.storm.tuple.Tuple;

public class HbasePersistBolt extends BaseRichBolt {

  private static final Logger logger = LoggerFactory.getLogger(HbasePersistBolt.class);

  OutputCollector collector;

  @Override
  public void prepare(Map stormConf, TopologyContext context, OutputCollector collector) {
    this.collector = collector;
  }

  @Override
  public void execute(Tuple input) {


  }

  @Override
  public void declareOutputFields(OutputFieldsDeclarer declarer) {}

}
