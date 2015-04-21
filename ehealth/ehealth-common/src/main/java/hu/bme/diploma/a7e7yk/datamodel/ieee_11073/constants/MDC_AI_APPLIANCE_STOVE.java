
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_AI_APPLIANCE_STOVE extends MdcNomenclatureValue {

  private static final MDC_AI_APPLIANCE_STOVE _instance = new MDC_AI_APPLIANCE_STOVE("MDC_AI_APPLIANCE_STOVE", 7296, 130);

  private MDC_AI_APPLIANCE_STOVE(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_AI_APPLIANCE_STOVE get() {
    return _instance;
  }
}
