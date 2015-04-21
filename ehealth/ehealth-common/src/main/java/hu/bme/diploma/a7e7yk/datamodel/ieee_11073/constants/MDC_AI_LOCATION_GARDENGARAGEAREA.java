
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_AI_LOCATION_GARDENGARAGEAREA extends MdcNomenclatureValue {

  private static final MDC_AI_LOCATION_GARDENGARAGEAREA _instance = new MDC_AI_LOCATION_GARDENGARAGEAREA("MDC_AI_LOCATION_GARDENGARAGEAREA", 4224, 130);

  private MDC_AI_LOCATION_GARDENGARAGEAREA(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_AI_LOCATION_GARDENGARAGEAREA get() {
    return _instance;
  }
}
