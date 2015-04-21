
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_AI_LOCATION_FRONTCUPBOARDDOOR extends MdcNomenclatureValue {

  private static final MDC_AI_LOCATION_FRONTCUPBOARDDOOR _instance = new MDC_AI_LOCATION_FRONTCUPBOARDDOOR("MDC_AI_LOCATION_FRONTCUPBOARDDOOR", 9536, 130);

  private MDC_AI_LOCATION_FRONTCUPBOARDDOOR(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_AI_LOCATION_FRONTCUPBOARDDOOR get() {
    return _instance;
  }
}
