
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_AI_LOCATION_KITCHENMAIN extends MdcNomenclatureValue {

  private static final MDC_AI_LOCATION_KITCHENMAIN _instance = new MDC_AI_LOCATION_KITCHENMAIN("MDC_AI_LOCATION_KITCHENMAIN", 3520, 130);

  private MDC_AI_LOCATION_KITCHENMAIN(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_AI_LOCATION_KITCHENMAIN get() {
    return _instance;
  }
}
