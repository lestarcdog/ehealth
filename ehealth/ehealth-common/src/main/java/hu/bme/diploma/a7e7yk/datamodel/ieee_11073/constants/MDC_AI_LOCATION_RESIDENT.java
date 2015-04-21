
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_AI_LOCATION_RESIDENT extends MdcNomenclatureValue {

  private static final MDC_AI_LOCATION_RESIDENT _instance = new MDC_AI_LOCATION_RESIDENT("MDC_AI_LOCATION_RESIDENT", 1152, 130);

  private MDC_AI_LOCATION_RESIDENT(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_AI_LOCATION_RESIDENT get() {
    return _instance;
  }
}
