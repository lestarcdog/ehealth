
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_AI_LOCATION_GARAGE extends MdcNomenclatureValue {

  private static final MDC_AI_LOCATION_GARAGE _instance = new MDC_AI_LOCATION_GARAGE("MDC_AI_LOCATION_GARAGE", 4096, 130);

  private MDC_AI_LOCATION_GARAGE(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_AI_LOCATION_GARAGE get() {
    return _instance;
  }
}
