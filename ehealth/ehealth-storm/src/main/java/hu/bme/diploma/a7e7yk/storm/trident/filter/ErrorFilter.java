package hu.bme.diploma.a7e7yk.storm.trident.filter;

import hu.bme.diploma.a7e7yk.storm.StormFieldsConstants;
import storm.trident.operation.BaseFilter;
import storm.trident.tuple.TridentTuple;

public class ErrorFilter extends BaseFilter {

  public ErrorFilter() {}

  @Override
  public boolean isKeep(TridentTuple tuple) {
    return tuple.getValueByField(StormFieldsConstants.ERROR_FIELD) == null;
  }

}
