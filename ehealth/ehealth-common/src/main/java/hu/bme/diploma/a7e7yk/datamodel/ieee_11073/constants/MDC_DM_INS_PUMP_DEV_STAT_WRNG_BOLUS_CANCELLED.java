
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_DM_INS_PUMP_DEV_STAT_WRNG_BOLUS_CANCELLED extends MdcNomenclatureValue {

  private static final MDC_DM_INS_PUMP_DEV_STAT_WRNG_BOLUS_CANCELLED _instance = new MDC_DM_INS_PUMP_DEV_STAT_WRNG_BOLUS_CANCELLED("MDC_DM_INS_PUMP_DEV_STAT_WRNG_BOLUS_CANCELLED", 29958, 128);

  private MDC_DM_INS_PUMP_DEV_STAT_WRNG_BOLUS_CANCELLED(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_DM_INS_PUMP_DEV_STAT_WRNG_BOLUS_CANCELLED get() {
    return _instance;
  }
}
