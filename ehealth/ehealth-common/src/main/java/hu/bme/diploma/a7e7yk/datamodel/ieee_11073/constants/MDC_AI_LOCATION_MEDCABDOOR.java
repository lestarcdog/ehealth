
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_AI_LOCATION_MEDCABDOOR extends MdcNomenclatureValue {

  private static final MDC_AI_LOCATION_MEDCABDOOR _instance = new MDC_AI_LOCATION_MEDCABDOOR("MDC_AI_LOCATION_MEDCABDOOR", 9408, 130);

  private MDC_AI_LOCATION_MEDCABDOOR(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_AI_LOCATION_MEDCABDOOR get() {
    return _instance;
  }
}
