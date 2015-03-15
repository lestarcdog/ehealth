package hu.bme.diploma.a7e7yk.storm.spouts.continua;

import java.util.Map;

import storm.trident.spout.ITridentSpout;
import backtype.storm.task.TopologyContext;
import backtype.storm.tuple.Fields;

public class ContinuaSpout implements ITridentSpout<Long> {

  private static final long serialVersionUID = 7843454057101302500L;
  private final BatchCoordinator<Long> coordinator = new ContinuaCoordinator();
  private final Emitter<Long> emitter = new ContinuaEmitter();

  @Override
  public storm.trident.spout.ITridentSpout.BatchCoordinator<Long> getCoordinator(String txStateId,
      Map conf, TopologyContext context) {
    return coordinator;
  }

  @Override
  public storm.trident.spout.ITridentSpout.Emitter<Long> getEmitter(String txStateId, Map conf,
      TopologyContext context) {
    return emitter;
  }

  @Override
  public Map getComponentConfiguration() {
    return null;
  }

  @Override
  public Fields getOutputFields() {
    return new Fields("test");
  }



}
