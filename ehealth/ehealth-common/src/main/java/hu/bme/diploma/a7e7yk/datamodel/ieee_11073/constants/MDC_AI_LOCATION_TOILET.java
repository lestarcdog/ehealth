
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_AI_LOCATION_TOILET extends MdcNomenclatureValue {

  private static final MDC_AI_LOCATION_TOILET _instance = new MDC_AI_LOCATION_TOILET("MDC_AI_LOCATION_TOILET", 3200, 130);

  private MDC_AI_LOCATION_TOILET(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_AI_LOCATION_TOILET get() {
    return _instance;
  }
}
