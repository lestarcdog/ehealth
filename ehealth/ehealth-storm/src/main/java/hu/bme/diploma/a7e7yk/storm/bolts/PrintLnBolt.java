package hu.bme.diploma.a7e7yk.storm.bolts;

import hu.bme.diploma.a7e7yk.storm.StormConstants;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import backtype.storm.task.OutputCollector;
import backtype.storm.task.TopologyContext;
import backtype.storm.topology.OutputFieldsDeclarer;
import backtype.storm.topology.base.BaseRichBolt;
import backtype.storm.tuple.Tuple;

public class PrintLnBolt extends BaseRichBolt {

  private static final long serialVersionUID = 2611134353453228210L;
  private String txt;
  private OutputCollector collector;
  private int partition;
  private static final Logger logger = LoggerFactory.getLogger(PrintLnBolt.class);

  public PrintLnBolt(String txt) {
    this.txt = txt;
  }

  @Override
  public void prepare(Map stormConf, TopologyContext context, OutputCollector collector) {
    this.collector = collector;
    partition = context.getThisTaskIndex();

  }

  @Override
  public void execute(Tuple input) {
    String ui = input.getStringByField(StormConstants.USER_ID_FIELD);
    logger.debug(txt + partition + "_" + "_" + ui);
    collector.ack(input);
  }

  @Override
  public void declareOutputFields(OutputFieldsDeclarer declarer) {
    // TODO Auto-generated method stub

  }

}
