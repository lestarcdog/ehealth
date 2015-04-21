
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_DM_TBR_REASON_UNKNOWN extends MdcNomenclatureValue {

  private static final MDC_DM_TBR_REASON_UNKNOWN _instance = new MDC_DM_TBR_REASON_UNKNOWN("MDC_DM_TBR_REASON_UNKNOWN", 29728, 128);

  private MDC_DM_TBR_REASON_UNKNOWN(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_DM_TBR_REASON_UNKNOWN get() {
    return _instance;
  }
}
