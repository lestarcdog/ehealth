
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_AI_LOCATION_UNSPECIFIED extends MdcNomenclatureValue {

  private static final MDC_AI_LOCATION_UNSPECIFIED _instance = new MDC_AI_LOCATION_UNSPECIFIED("MDC_AI_LOCATION_UNSPECIFIED", 1088, 130);

  private MDC_AI_LOCATION_UNSPECIFIED(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_AI_LOCATION_UNSPECIFIED get() {
    return _instance;
  }
}
