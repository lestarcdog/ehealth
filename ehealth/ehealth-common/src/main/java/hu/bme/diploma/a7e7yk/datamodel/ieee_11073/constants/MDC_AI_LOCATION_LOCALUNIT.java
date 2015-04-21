
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_AI_LOCATION_LOCALUNIT extends MdcNomenclatureValue {

  private static final MDC_AI_LOCATION_LOCALUNIT _instance = new MDC_AI_LOCATION_LOCALUNIT("MDC_AI_LOCATION_LOCALUNIT", 1216, 130);

  private MDC_AI_LOCATION_LOCALUNIT(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_AI_LOCATION_LOCALUNIT get() {
    return _instance;
  }
}
