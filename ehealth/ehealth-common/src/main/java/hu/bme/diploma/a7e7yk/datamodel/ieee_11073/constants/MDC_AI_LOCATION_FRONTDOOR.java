
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_AI_LOCATION_FRONTDOOR extends MdcNomenclatureValue {

  private static final MDC_AI_LOCATION_FRONTDOOR _instance = new MDC_AI_LOCATION_FRONTDOOR("MDC_AI_LOCATION_FRONTDOOR", 9216, 130);

  private MDC_AI_LOCATION_FRONTDOOR(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_AI_LOCATION_FRONTDOOR get() {
    return _instance;
  }
}
