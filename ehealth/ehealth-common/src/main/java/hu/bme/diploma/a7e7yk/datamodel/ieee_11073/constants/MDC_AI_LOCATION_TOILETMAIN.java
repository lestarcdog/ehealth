
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_AI_LOCATION_TOILETMAIN extends MdcNomenclatureValue {

  private static final MDC_AI_LOCATION_TOILETMAIN _instance = new MDC_AI_LOCATION_TOILETMAIN("MDC_AI_LOCATION_TOILETMAIN", 3264, 130);

  private MDC_AI_LOCATION_TOILETMAIN(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_AI_LOCATION_TOILETMAIN get() {
    return _instance;
  }
}
