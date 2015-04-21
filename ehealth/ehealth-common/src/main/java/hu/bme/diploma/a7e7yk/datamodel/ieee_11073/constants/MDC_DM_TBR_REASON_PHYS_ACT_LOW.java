
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_DM_TBR_REASON_PHYS_ACT_LOW extends MdcNomenclatureValue {

  private static final MDC_DM_TBR_REASON_PHYS_ACT_LOW _instance = new MDC_DM_TBR_REASON_PHYS_ACT_LOW("MDC_DM_TBR_REASON_PHYS_ACT_LOW", 29730, 128);

  private MDC_DM_TBR_REASON_PHYS_ACT_LOW(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_DM_TBR_REASON_PHYS_ACT_LOW get() {
    return _instance;
  }
}
