
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_AI_APPLIANCE_APPLIANCE extends MdcNomenclatureValue {

  private static final MDC_AI_APPLIANCE_APPLIANCE _instance = new MDC_AI_APPLIANCE_APPLIANCE("MDC_AI_APPLIANCE_APPLIANCE", 7552, 130);

  private MDC_AI_APPLIANCE_APPLIANCE(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_AI_APPLIANCE_APPLIANCE get() {
    return _instance;
  }
}
