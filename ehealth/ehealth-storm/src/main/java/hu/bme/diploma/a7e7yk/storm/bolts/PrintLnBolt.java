package hu.bme.diploma.a7e7yk.storm.bolts;

import java.util.Map;

import storm.trident.operation.BaseFunction;
import storm.trident.operation.TridentCollector;
import storm.trident.operation.TridentOperationContext;
import storm.trident.tuple.TridentTuple;

public class PrintLnBolt extends BaseFunction {

  String txt;
  int idx;

  public PrintLnBolt(String message) {
    txt = message;
  }

  @Override
  public void execute(TridentTuple tuple, TridentCollector collector) {

    System.err.println(txt + idx + " userid: " + tuple.getInteger(0));
  }

  @Override
  public void prepare(Map conf, TridentOperationContext context) {
    idx = context.getPartitionIndex();
    super.prepare(conf, context);
  }

}
