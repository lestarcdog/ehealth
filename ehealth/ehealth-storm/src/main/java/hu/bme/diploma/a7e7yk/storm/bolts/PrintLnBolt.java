package hu.bme.diploma.a7e7yk.storm.bolts;

import hu.bme.diploma.a7e7yk.storm.StormFieldsConstants;

import java.util.Map;

import backtype.storm.task.OutputCollector;
import backtype.storm.task.TopologyContext;
import backtype.storm.topology.OutputFieldsDeclarer;
import backtype.storm.topology.base.BaseRichBolt;
import backtype.storm.tuple.Tuple;

public class PrintLnBolt extends BaseRichBolt {

  private String txt;
  private OutputCollector collector;
  private int partition;

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
    String si = input.getStringByField(StormFieldsConstants.SENDER_ID_FIELD);
    String ui = input.getStringByField(StormFieldsConstants.USER_ID_FIELD);
    System.err.println(txt + partition + "_" + si + "_" + ui);
    collector.ack(input);
    System.err.println();

  }

  @Override
  public void declareOutputFields(OutputFieldsDeclarer declarer) {
    // TODO Auto-generated method stub

  }

}
