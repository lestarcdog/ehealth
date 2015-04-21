
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_AI_APPLIANCE_TOASTER extends MdcNomenclatureValue {

  private static final MDC_AI_APPLIANCE_TOASTER _instance = new MDC_AI_APPLIANCE_TOASTER("MDC_AI_APPLIANCE_TOASTER", 7424, 130);

  private MDC_AI_APPLIANCE_TOASTER(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_AI_APPLIANCE_TOASTER get() {
    return _instance;
  }
}
