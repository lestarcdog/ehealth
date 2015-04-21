
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_DM_INS_PUMP_OP_STAT_STANDBY extends MdcNomenclatureValue {

  private static final MDC_DM_INS_PUMP_OP_STAT_STANDBY _instance = new MDC_DM_INS_PUMP_OP_STAT_STANDBY("MDC_DM_INS_PUMP_OP_STAT_STANDBY", 29747, 128);

  private MDC_DM_INS_PUMP_OP_STAT_STANDBY(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_DM_INS_PUMP_OP_STAT_STANDBY get() {
    return _instance;
  }
}
