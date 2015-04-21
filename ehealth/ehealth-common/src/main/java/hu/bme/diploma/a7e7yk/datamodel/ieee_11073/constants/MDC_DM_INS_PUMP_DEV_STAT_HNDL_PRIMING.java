
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_DM_INS_PUMP_DEV_STAT_HNDL_PRIMING extends MdcNomenclatureValue {

  private static final MDC_DM_INS_PUMP_DEV_STAT_HNDL_PRIMING _instance = new MDC_DM_INS_PUMP_DEV_STAT_HNDL_PRIMING("MDC_DM_INS_PUMP_DEV_STAT_HNDL_PRIMING", 29829, 128);

  private MDC_DM_INS_PUMP_DEV_STAT_HNDL_PRIMING(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_DM_INS_PUMP_DEV_STAT_HNDL_PRIMING get() {
    return _instance;
  }
}
