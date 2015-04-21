
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_DM_INS_PUMP_DEV_STAT_WRNG_BATTERY_LOW extends MdcNomenclatureValue {

  private static final MDC_DM_INS_PUMP_DEV_STAT_WRNG_BATTERY_LOW _instance = new MDC_DM_INS_PUMP_DEV_STAT_WRNG_BATTERY_LOW("MDC_DM_INS_PUMP_DEV_STAT_WRNG_BATTERY_LOW", 29954, 128);

  private MDC_DM_INS_PUMP_DEV_STAT_WRNG_BATTERY_LOW(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_DM_INS_PUMP_DEV_STAT_WRNG_BATTERY_LOW get() {
    return _instance;
  }
}
