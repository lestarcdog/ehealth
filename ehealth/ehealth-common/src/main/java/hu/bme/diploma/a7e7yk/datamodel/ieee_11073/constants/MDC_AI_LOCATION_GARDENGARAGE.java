
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_AI_LOCATION_GARDENGARAGE extends MdcNomenclatureValue {

  private static final MDC_AI_LOCATION_GARDENGARAGE _instance = new MDC_AI_LOCATION_GARDENGARAGE("MDC_AI_LOCATION_GARDENGARAGE", 4160, 130);

  private MDC_AI_LOCATION_GARDENGARAGE(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_AI_LOCATION_GARDENGARAGE get() {
    return _instance;
  }
}
