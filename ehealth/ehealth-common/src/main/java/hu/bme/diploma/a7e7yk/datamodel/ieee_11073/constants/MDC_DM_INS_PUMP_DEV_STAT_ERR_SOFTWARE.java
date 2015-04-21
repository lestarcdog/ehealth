
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_DM_INS_PUMP_DEV_STAT_ERR_SOFTWARE extends MdcNomenclatureValue {

  private static final MDC_DM_INS_PUMP_DEV_STAT_ERR_SOFTWARE _instance = new MDC_DM_INS_PUMP_DEV_STAT_ERR_SOFTWARE("MDC_DM_INS_PUMP_DEV_STAT_ERR_SOFTWARE", 29894, 128);

  private MDC_DM_INS_PUMP_DEV_STAT_ERR_SOFTWARE(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_DM_INS_PUMP_DEV_STAT_ERR_SOFTWARE get() {
    return _instance;
  }
}
