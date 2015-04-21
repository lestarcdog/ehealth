
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_DM_TBR_REASON_MENSES extends MdcNomenclatureValue {

  private static final MDC_DM_TBR_REASON_MENSES _instance = new MDC_DM_TBR_REASON_MENSES("MDC_DM_TBR_REASON_MENSES", 29733, 128);

  private MDC_DM_TBR_REASON_MENSES(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_DM_TBR_REASON_MENSES get() {
    return _instance;
  }
}
