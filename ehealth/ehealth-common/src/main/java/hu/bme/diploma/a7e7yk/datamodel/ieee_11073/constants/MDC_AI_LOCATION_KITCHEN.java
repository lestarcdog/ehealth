
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_AI_LOCATION_KITCHEN extends MdcNomenclatureValue {

  private static final MDC_AI_LOCATION_KITCHEN _instance = new MDC_AI_LOCATION_KITCHEN("MDC_AI_LOCATION_KITCHEN", 3456, 130);

  private MDC_AI_LOCATION_KITCHEN(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_AI_LOCATION_KITCHEN get() {
    return _instance;
  }
}
