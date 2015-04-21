
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_DM_BOLUS_REASON_MEAL extends MdcNomenclatureValue {

  private static final MDC_DM_BOLUS_REASON_MEAL _instance = new MDC_DM_BOLUS_REASON_MEAL("MDC_DM_BOLUS_REASON_MEAL", 29714, 128);

  private MDC_DM_BOLUS_REASON_MEAL(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_DM_BOLUS_REASON_MEAL get() {
    return _instance;
  }
}
