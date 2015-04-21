
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_DM_TBR_REASON_PHYS_ACT_HIGH extends MdcNomenclatureValue {

  private static final MDC_DM_TBR_REASON_PHYS_ACT_HIGH _instance = new MDC_DM_TBR_REASON_PHYS_ACT_HIGH("MDC_DM_TBR_REASON_PHYS_ACT_HIGH", 29731, 128);

  private MDC_DM_TBR_REASON_PHYS_ACT_HIGH(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_DM_TBR_REASON_PHYS_ACT_HIGH get() {
    return _instance;
  }
}
