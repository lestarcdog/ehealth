
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_AI_APPLIANCE_MICROWAVE extends MdcNomenclatureValue {

  private static final MDC_AI_APPLIANCE_MICROWAVE _instance = new MDC_AI_APPLIANCE_MICROWAVE("MDC_AI_APPLIANCE_MICROWAVE", 7360, 130);

  private MDC_AI_APPLIANCE_MICROWAVE(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_AI_APPLIANCE_MICROWAVE get() {
    return _instance;
  }
}
