
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_DM_INS_PUMP_DEV_STAT_ERR_CARTRIDGE_EMPTY extends MdcNomenclatureValue {

  private static final MDC_DM_INS_PUMP_DEV_STAT_ERR_CARTRIDGE_EMPTY _instance = new MDC_DM_INS_PUMP_DEV_STAT_ERR_CARTRIDGE_EMPTY("MDC_DM_INS_PUMP_DEV_STAT_ERR_CARTRIDGE_EMPTY", 29889, 128);

  private MDC_DM_INS_PUMP_DEV_STAT_ERR_CARTRIDGE_EMPTY(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_DM_INS_PUMP_DEV_STAT_ERR_CARTRIDGE_EMPTY get() {
    return _instance;
  }
}
