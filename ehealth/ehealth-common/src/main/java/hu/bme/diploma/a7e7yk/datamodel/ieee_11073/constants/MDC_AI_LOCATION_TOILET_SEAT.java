
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_AI_LOCATION_TOILET_SEAT extends MdcNomenclatureValue {

  private static final MDC_AI_LOCATION_TOILET_SEAT _instance = new MDC_AI_LOCATION_TOILET_SEAT("MDC_AI_LOCATION_TOILET_SEAT", 11456, 130);

  private MDC_AI_LOCATION_TOILET_SEAT(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_AI_LOCATION_TOILET_SEAT get() {
    return _instance;
  }
}
