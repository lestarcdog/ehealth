
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_DM_INS_PUMP_DEV_STAT_ERR_CARTRIDGE extends MdcNomenclatureValue {

  private static final MDC_DM_INS_PUMP_DEV_STAT_ERR_CARTRIDGE _instance = new MDC_DM_INS_PUMP_DEV_STAT_ERR_CARTRIDGE("MDC_DM_INS_PUMP_DEV_STAT_ERR_CARTRIDGE", 29896, 128);

  private MDC_DM_INS_PUMP_DEV_STAT_ERR_CARTRIDGE(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_DM_INS_PUMP_DEV_STAT_ERR_CARTRIDGE get() {
    return _instance;
  }
}
