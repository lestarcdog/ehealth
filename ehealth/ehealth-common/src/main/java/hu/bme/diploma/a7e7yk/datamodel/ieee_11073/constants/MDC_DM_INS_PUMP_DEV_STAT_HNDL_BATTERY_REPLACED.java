
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_DM_INS_PUMP_DEV_STAT_HNDL_BATTERY_REPLACED extends MdcNomenclatureValue {

  private static final MDC_DM_INS_PUMP_DEV_STAT_HNDL_BATTERY_REPLACED _instance = new MDC_DM_INS_PUMP_DEV_STAT_HNDL_BATTERY_REPLACED("MDC_DM_INS_PUMP_DEV_STAT_HNDL_BATTERY_REPLACED", 29825, 128);

  private MDC_DM_INS_PUMP_DEV_STAT_HNDL_BATTERY_REPLACED(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_DM_INS_PUMP_DEV_STAT_HNDL_BATTERY_REPLACED get() {
    return _instance;
  }
}
