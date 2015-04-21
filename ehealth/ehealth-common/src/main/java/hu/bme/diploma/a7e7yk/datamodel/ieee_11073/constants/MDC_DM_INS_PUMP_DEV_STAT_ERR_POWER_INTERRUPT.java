
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_DM_INS_PUMP_DEV_STAT_ERR_POWER_INTERRUPT extends MdcNomenclatureValue {

  private static final MDC_DM_INS_PUMP_DEV_STAT_ERR_POWER_INTERRUPT _instance = new MDC_DM_INS_PUMP_DEV_STAT_ERR_POWER_INTERRUPT("MDC_DM_INS_PUMP_DEV_STAT_ERR_POWER_INTERRUPT", 29895, 128);

  private MDC_DM_INS_PUMP_DEV_STAT_ERR_POWER_INTERRUPT(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_DM_INS_PUMP_DEV_STAT_ERR_POWER_INTERRUPT get() {
    return _instance;
  }
}
