
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_DM_INS_PUMP_DEV_STAT extends MdcNomenclatureValue {

  private static final MDC_DM_INS_PUMP_DEV_STAT _instance = new MDC_DM_INS_PUMP_DEV_STAT("MDC_DM_INS_PUMP_DEV_STAT", 29760, 128);

  private MDC_DM_INS_PUMP_DEV_STAT(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_DM_INS_PUMP_DEV_STAT get() {
    return _instance;
  }
}
