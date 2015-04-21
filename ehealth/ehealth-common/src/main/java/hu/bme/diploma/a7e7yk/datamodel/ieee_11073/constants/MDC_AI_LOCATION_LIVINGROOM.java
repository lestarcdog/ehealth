
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_AI_LOCATION_LIVINGROOM extends MdcNomenclatureValue {

  private static final MDC_AI_LOCATION_LIVINGROOM _instance = new MDC_AI_LOCATION_LIVINGROOM("MDC_AI_LOCATION_LIVINGROOM", 3648, 130);

  private MDC_AI_LOCATION_LIVINGROOM(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_AI_LOCATION_LIVINGROOM get() {
    return _instance;
  }
}
