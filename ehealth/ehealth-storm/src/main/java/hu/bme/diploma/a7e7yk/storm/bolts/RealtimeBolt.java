package hu.bme.diploma.a7e7yk.storm.bolts;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import backtype.storm.task.OutputCollector;
import backtype.storm.task.TopologyContext;
import backtype.storm.topology.OutputFieldsDeclarer;
import backtype.storm.topology.base.BaseRichBolt;
import backtype.storm.tuple.Tuple;

/**
 * In general, you should avoid storing state information in a bolt since any time a worker fails
 * and/or has its tasks reassigned, that information will be lost. One solution is to periodically
 * take a snapshot of state information to a persistent store, such as a database, so it can be
 * restored if a task is reassigned.
 * 
 *
 */
public class RealtimeBolt extends BaseRichBolt {

  private static final long serialVersionUID = -4086509759524403646L;
  private static final Logger logger = LoggerFactory.getLogger(RealtimeBolt.class);
  private OutputCollector collector;

  @Override
  public void prepare(Map stormConf, TopologyContext context, OutputCollector collector) {
    this.collector = collector;

  }

  @Override
  public void execute(Tuple input) {
    // CEP -> Netty server
    collector.ack(input);
  }

  @Override
  public void declareOutputFields(OutputFieldsDeclarer declarer) {

  }

}
