
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_DM_INS_PUMP_DEV_STAT_ERR_BATTERY_DEPLETED extends MdcNomenclatureValue {

  private static final MDC_DM_INS_PUMP_DEV_STAT_ERR_BATTERY_DEPLETED _instance = new MDC_DM_INS_PUMP_DEV_STAT_ERR_BATTERY_DEPLETED("MDC_DM_INS_PUMP_DEV_STAT_ERR_BATTERY_DEPLETED", 29890, 128);

  private MDC_DM_INS_PUMP_DEV_STAT_ERR_BATTERY_DEPLETED(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_DM_INS_PUMP_DEV_STAT_ERR_BATTERY_DEPLETED get() {
    return _instance;
  }
}
