
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_AI_LOCATION_LIVINGAREA extends MdcNomenclatureValue {

  private static final MDC_AI_LOCATION_LIVINGAREA _instance = new MDC_AI_LOCATION_LIVINGAREA("MDC_AI_LOCATION_LIVINGAREA", 3584, 130);

  private MDC_AI_LOCATION_LIVINGAREA(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_AI_LOCATION_LIVINGAREA get() {
    return _instance;
  }
}
