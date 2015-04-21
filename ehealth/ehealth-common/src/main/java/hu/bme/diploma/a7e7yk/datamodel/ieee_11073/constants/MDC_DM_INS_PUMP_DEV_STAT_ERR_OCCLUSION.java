
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_DM_INS_PUMP_DEV_STAT_ERR_OCCLUSION extends MdcNomenclatureValue {

  private static final MDC_DM_INS_PUMP_DEV_STAT_ERR_OCCLUSION _instance = new MDC_DM_INS_PUMP_DEV_STAT_ERR_OCCLUSION("MDC_DM_INS_PUMP_DEV_STAT_ERR_OCCLUSION", 29891, 128);

  private MDC_DM_INS_PUMP_DEV_STAT_ERR_OCCLUSION(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_DM_INS_PUMP_DEV_STAT_ERR_OCCLUSION get() {
    return _instance;
  }
}
