package hu.bme.diploma.a7e7yk.storm.bolts;

import hu.bme.diploma.a7e7yk.converters.RealTimeDtoConverter;
import hu.bme.diploma.a7e7yk.datamodel.health.vitalsigns.AbstractVitalSign;
import hu.bme.diploma.a7e7yk.exceptions.EhealthException;
import hu.bme.diploma.a7e7yk.healthrules.DecisionSession;
import hu.bme.diploma.a7e7yk.healthrules.DecisionSupport;
import hu.bme.diploma.a7e7yk.storm.StormConstants;
import hu.bme.diploma.a7e7yk.storm.realtime.RealtimeMessageBroker;

import java.util.List;
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
  private DecisionSupport decisionSupport;
  private RealtimeMessageBroker rtMessageBroker;


  @Override
  public void prepare(Map stormConf, TopologyContext context, OutputCollector collector) {
    this.collector = collector;
    decisionSupport = DecisionSupport.get();
    rtMessageBroker = RealtimeMessageBroker.get();
  }

  @Override
  public void execute(Tuple input) {
    @SuppressWarnings("unchecked")
    List<AbstractVitalSign> signValues =
        (List<AbstractVitalSign>) input.getValueByField(StormConstants.MEASUREMENTS_FIELD);
    String userId = (String) input.getValueByField(StormConstants.USER_ID_FIELD);
    DecisionSession session = decisionSupport.getSession(userId);

    // send vitalsigns to decision support
    try {
      session.addVitalSigns(signValues);
    } catch (EhealthException e) {
      logger.error(null, e);
    }

    // send data to realtime observers
    for (AbstractVitalSign v : signValues) {
      rtMessageBroker.sendMessageToObservers(RealTimeDtoConverter.convert2Measurement(v, userId));

    }
    collector.ack(input);
  }

  @Override
  public void declareOutputFields(OutputFieldsDeclarer declarer) {}

  @Override
  public void cleanup() {
    rtMessageBroker.close();
  }

}
