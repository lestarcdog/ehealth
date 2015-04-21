
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_AI_LOCATION_START extends MdcNomenclatureValue {

  private static final MDC_AI_LOCATION_START _instance = new MDC_AI_LOCATION_START("MDC_AI_LOCATION_START", 1024, 130);

  private MDC_AI_LOCATION_START(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_AI_LOCATION_START get() {
    return _instance;
  }
}
