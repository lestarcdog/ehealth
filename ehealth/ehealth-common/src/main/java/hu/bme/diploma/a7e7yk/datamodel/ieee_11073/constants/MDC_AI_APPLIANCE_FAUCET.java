
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_AI_APPLIANCE_FAUCET extends MdcNomenclatureValue {

  private static final MDC_AI_APPLIANCE_FAUCET _instance = new MDC_AI_APPLIANCE_FAUCET("MDC_AI_APPLIANCE_FAUCET", 7616, 130);

  private MDC_AI_APPLIANCE_FAUCET(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_AI_APPLIANCE_FAUCET get() {
    return _instance;
  }
}
