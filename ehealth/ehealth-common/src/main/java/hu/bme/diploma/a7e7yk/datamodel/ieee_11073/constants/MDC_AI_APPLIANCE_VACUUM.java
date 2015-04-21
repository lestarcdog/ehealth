
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_AI_APPLIANCE_VACUUM extends MdcNomenclatureValue {

  private static final MDC_AI_APPLIANCE_VACUUM _instance = new MDC_AI_APPLIANCE_VACUUM("MDC_AI_APPLIANCE_VACUUM", 7488, 130);

  private MDC_AI_APPLIANCE_VACUUM(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_AI_APPLIANCE_VACUUM get() {
    return _instance;
  }
}
