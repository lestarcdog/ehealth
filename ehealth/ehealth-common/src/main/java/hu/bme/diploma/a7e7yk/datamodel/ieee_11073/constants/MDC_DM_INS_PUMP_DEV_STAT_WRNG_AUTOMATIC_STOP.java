
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_DM_INS_PUMP_DEV_STAT_WRNG_AUTOMATIC_STOP extends MdcNomenclatureValue {

  private static final MDC_DM_INS_PUMP_DEV_STAT_WRNG_AUTOMATIC_STOP _instance = new MDC_DM_INS_PUMP_DEV_STAT_WRNG_AUTOMATIC_STOP("MDC_DM_INS_PUMP_DEV_STAT_WRNG_AUTOMATIC_STOP", 29955, 128);

  private MDC_DM_INS_PUMP_DEV_STAT_WRNG_AUTOMATIC_STOP(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_DM_INS_PUMP_DEV_STAT_WRNG_AUTOMATIC_STOP get() {
    return _instance;
  }
}
