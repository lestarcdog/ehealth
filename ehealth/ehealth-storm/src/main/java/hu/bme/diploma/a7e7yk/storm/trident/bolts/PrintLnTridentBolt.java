package hu.bme.diploma.a7e7yk.storm.trident.bolts;

import hu.bme.diploma.a7e7yk.storm.StormFieldsConstants;

import java.util.Map;

import storm.trident.operation.BaseFunction;
import storm.trident.operation.TridentCollector;
import storm.trident.operation.TridentOperationContext;
import storm.trident.tuple.TridentTuple;

public class PrintLnTridentBolt extends BaseFunction {

  String txt;
  int idx;

  public PrintLnTridentBolt(String message) {
    txt = message;
  }

  @Override
  public void execute(TridentTuple tuple, TridentCollector collector) {

    System.err.println(txt + idx + " userid: " + tuple.getStringByField(StormFieldsConstants.USER_ID_FIELD));
  }

  @Override
  public void prepare(Map conf, TridentOperationContext context) {
    idx = context.getPartitionIndex();
  }

}
