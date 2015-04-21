
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_AI_APPLIANCE_KETTLE extends MdcNomenclatureValue {

  private static final MDC_AI_APPLIANCE_KETTLE _instance = new MDC_AI_APPLIANCE_KETTLE("MDC_AI_APPLIANCE_KETTLE", 7168, 130);

  private MDC_AI_APPLIANCE_KETTLE(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_AI_APPLIANCE_KETTLE get() {
    return _instance;
  }
}
