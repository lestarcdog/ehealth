
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_DM_TBR_REASON_STRESS extends MdcNomenclatureValue {

  private static final MDC_DM_TBR_REASON_STRESS _instance = new MDC_DM_TBR_REASON_STRESS("MDC_DM_TBR_REASON_STRESS", 29729, 128);

  private MDC_DM_TBR_REASON_STRESS(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_DM_TBR_REASON_STRESS get() {
    return _instance;
  }
}
