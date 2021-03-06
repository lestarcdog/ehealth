
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_AI_LOCATION_STAIRS extends MdcNomenclatureValue {

  private static final MDC_AI_LOCATION_STAIRS _instance = new MDC_AI_LOCATION_STAIRS("MDC_AI_LOCATION_STAIRS", 3968, 130);

  private MDC_AI_LOCATION_STAIRS(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_AI_LOCATION_STAIRS get() {
    return _instance;
  }
}
