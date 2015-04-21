
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_AI_LOCATION_BACKDOOR extends MdcNomenclatureValue {

  private static final MDC_AI_LOCATION_BACKDOOR _instance = new MDC_AI_LOCATION_BACKDOOR("MDC_AI_LOCATION_BACKDOOR", 9280, 130);

  private MDC_AI_LOCATION_BACKDOOR(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_AI_LOCATION_BACKDOOR get() {
    return _instance;
  }
}
