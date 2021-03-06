
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_AI_LOCATION_STUDY extends MdcNomenclatureValue {

  private static final MDC_AI_LOCATION_STUDY _instance = new MDC_AI_LOCATION_STUDY("MDC_AI_LOCATION_STUDY", 3776, 130);

  private MDC_AI_LOCATION_STUDY(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_AI_LOCATION_STUDY get() {
    return _instance;
  }
}
