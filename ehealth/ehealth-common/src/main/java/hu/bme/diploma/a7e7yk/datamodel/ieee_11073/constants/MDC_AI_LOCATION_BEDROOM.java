
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_AI_LOCATION_BEDROOM extends MdcNomenclatureValue {

  private static final MDC_AI_LOCATION_BEDROOM _instance = new MDC_AI_LOCATION_BEDROOM("MDC_AI_LOCATION_BEDROOM", 3072, 130);

  private MDC_AI_LOCATION_BEDROOM(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_AI_LOCATION_BEDROOM get() {
    return _instance;
  }
}
