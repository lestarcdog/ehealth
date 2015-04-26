package hu.bme.diploma.a7e7yk.storm.bolts;

import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.AbstractVitalSign;
import hu.bme.diploma.a7e7yk.storm.StormConstants;

import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

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

  private AtomicInteger i;

  @Override
  public void prepare(Map stormConf, TopologyContext context, OutputCollector collector) {
    this.collector = collector;
    i = new AtomicInteger();
  }

  @Override
  public void execute(Tuple input) {
    System.err.println("ErrorFilter executed:" + i.getAndIncrement());
    collector.ack(input);
    if (input.getValueByField(StormConstants.ERROR_FIELD) == null) {
      logger.debug("Passing along {} messages",
          ((List<AbstractVitalSign>) input.getValueByField(StormConstants.MEASUREMENTS_FIELD)).size());
      collector.emit(new Values(input.getValueByField(StormConstants.USER_ID_FIELD), input
          .getValueByField(StormConstants.MEASUREMENTS_FIELD)));
    } else {
      logger.debug("Error filter of {}", input.getValueByField(StormConstants.ERROR_FIELD));
    }
  }

  @Override
  public void declareOutputFields(OutputFieldsDeclarer declarer) {
    declarer.declare(new Fields(StormConstants.USER_ID_FIELD, StormConstants.MEASUREMENTS_FIELD));
  }

}
