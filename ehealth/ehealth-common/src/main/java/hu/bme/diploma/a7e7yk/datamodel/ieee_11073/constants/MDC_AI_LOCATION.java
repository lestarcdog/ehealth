
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_AI_LOCATION extends MdcNomenclatureValue {

  private static final MDC_AI_LOCATION _instance = new MDC_AI_LOCATION("MDC_AI_LOCATION", 1023, 130);

  private MDC_AI_LOCATION(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_AI_LOCATION get() {
    return _instance;
  }
}
