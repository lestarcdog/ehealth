
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_AI_LOCATION_BED extends MdcNomenclatureValue {

  private static final MDC_AI_LOCATION_BED _instance = new MDC_AI_LOCATION_BED("MDC_AI_LOCATION_BED", 11264, 130);

  private MDC_AI_LOCATION_BED(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_AI_LOCATION_BED get() {
    return _instance;
  }
}
