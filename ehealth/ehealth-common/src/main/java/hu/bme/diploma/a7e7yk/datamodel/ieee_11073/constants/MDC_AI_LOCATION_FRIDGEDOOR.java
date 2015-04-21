
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_AI_LOCATION_FRIDGEDOOR extends MdcNomenclatureValue {

  private static final MDC_AI_LOCATION_FRIDGEDOOR _instance = new MDC_AI_LOCATION_FRIDGEDOOR("MDC_AI_LOCATION_FRIDGEDOOR", 9344, 130);

  private MDC_AI_LOCATION_FRIDGEDOOR(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_AI_LOCATION_FRIDGEDOOR get() {
    return _instance;
  }
}
