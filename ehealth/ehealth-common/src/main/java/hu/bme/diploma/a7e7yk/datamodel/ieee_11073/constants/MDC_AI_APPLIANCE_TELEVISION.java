
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_AI_APPLIANCE_TELEVISION extends MdcNomenclatureValue {

  private static final MDC_AI_APPLIANCE_TELEVISION _instance = new MDC_AI_APPLIANCE_TELEVISION("MDC_AI_APPLIANCE_TELEVISION", 7232, 130);

  private MDC_AI_APPLIANCE_TELEVISION(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_AI_APPLIANCE_TELEVISION get() {
    return _instance;
  }
}
