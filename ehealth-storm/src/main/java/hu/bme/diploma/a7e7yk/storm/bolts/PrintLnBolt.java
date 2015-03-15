package hu.bme.diploma.a7e7yk.storm.bolts;

import storm.trident.operation.BaseFunction;
import storm.trident.operation.TridentCollector;
import storm.trident.tuple.TridentTuple;

public class PrintLnBolt extends BaseFunction {

  @Override
  public void execute(TridentTuple tuple, TridentCollector collector) {
    // List<Integer> list = (List<Integer>) tuple.get(0);
    // list.stream().forEach(System.err::println);
    // collector.emit(Collections.EMPTY_LIST);
    String i = tuple.getString(0);
    // if (i.startsWith("5")) {
    // throw new FailedException("fail me");
    // }
    System.err.println("Value: " + i);


  }



}
