
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_DM_INS_PUMP_OP_STAT_OPERATING extends MdcNomenclatureValue {

  private static final MDC_DM_INS_PUMP_OP_STAT_OPERATING _instance = new MDC_DM_INS_PUMP_OP_STAT_OPERATING("MDC_DM_INS_PUMP_OP_STAT_OPERATING", 29748, 128);

  private MDC_DM_INS_PUMP_OP_STAT_OPERATING(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_DM_INS_PUMP_OP_STAT_OPERATING get() {
    return _instance;
  }
}
