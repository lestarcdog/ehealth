
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_DM_INS_PUMP_DEV_STAT_ERR_UNKNOWN extends MdcNomenclatureValue {

  private static final MDC_DM_INS_PUMP_DEV_STAT_ERR_UNKNOWN _instance = new MDC_DM_INS_PUMP_DEV_STAT_ERR_UNKNOWN("MDC_DM_INS_PUMP_DEV_STAT_ERR_UNKNOWN", 29888, 128);

  private MDC_DM_INS_PUMP_DEV_STAT_ERR_UNKNOWN(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_DM_INS_PUMP_DEV_STAT_ERR_UNKNOWN get() {
    return _instance;
  }
}
