
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_AI_LOCATION_STOOL extends MdcNomenclatureValue {

  private static final MDC_AI_LOCATION_STOOL _instance = new MDC_AI_LOCATION_STOOL("MDC_AI_LOCATION_STOOL", 11520, 130);

  private MDC_AI_LOCATION_STOOL(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_AI_LOCATION_STOOL get() {
    return _instance;
  }
}
