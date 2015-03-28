package hu.bme.diploma.a7e7yk.storm.bolts;

import storm.trident.operation.BaseFunction;
import storm.trident.operation.TridentCollector;
import storm.trident.tuple.TridentTuple;
import ca.uhn.hl7v2.HapiContext;

public class ContinuaMessageConverterBolt extends BaseFunction {

  private static final long serialVersionUID = 2269618342384875116L;

  private HapiContext ctx;

  public ContinuaMessageConverterBolt() {

  }

  @Override
  public void execute(TridentTuple tuple, TridentCollector collector) {
    String msg = (String) tuple.get(0);

  }

}
