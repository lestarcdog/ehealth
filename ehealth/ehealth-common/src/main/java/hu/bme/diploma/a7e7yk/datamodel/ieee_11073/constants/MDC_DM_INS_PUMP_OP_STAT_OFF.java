
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_DM_INS_PUMP_OP_STAT_OFF extends MdcNomenclatureValue {

  private static final MDC_DM_INS_PUMP_OP_STAT_OFF _instance = new MDC_DM_INS_PUMP_OP_STAT_OFF("MDC_DM_INS_PUMP_OP_STAT_OFF", 29746, 128);

  private MDC_DM_INS_PUMP_OP_STAT_OFF(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_DM_INS_PUMP_OP_STAT_OFF get() {
    return _instance;
  }
}
