
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_DM_INS_PUMP_DEV_STAT_HNDL_REWINDING extends MdcNomenclatureValue {

  private static final MDC_DM_INS_PUMP_DEV_STAT_HNDL_REWINDING _instance = new MDC_DM_INS_PUMP_DEV_STAT_HNDL_REWINDING("MDC_DM_INS_PUMP_DEV_STAT_HNDL_REWINDING", 29828, 128);

  private MDC_DM_INS_PUMP_DEV_STAT_HNDL_REWINDING(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_DM_INS_PUMP_DEV_STAT_HNDL_REWINDING get() {
    return _instance;
  }
}
