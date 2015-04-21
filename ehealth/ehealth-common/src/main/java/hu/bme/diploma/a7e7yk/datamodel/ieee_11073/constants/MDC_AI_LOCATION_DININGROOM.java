
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_AI_LOCATION_DININGROOM extends MdcNomenclatureValue {

  private static final MDC_AI_LOCATION_DININGROOM _instance = new MDC_AI_LOCATION_DININGROOM("MDC_AI_LOCATION_DININGROOM", 3712, 130);

  private MDC_AI_LOCATION_DININGROOM(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_AI_LOCATION_DININGROOM get() {
    return _instance;
  }
}
