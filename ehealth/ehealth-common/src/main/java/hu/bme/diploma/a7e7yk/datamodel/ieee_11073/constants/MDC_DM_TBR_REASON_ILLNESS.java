
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_DM_TBR_REASON_ILLNESS extends MdcNomenclatureValue {

  private static final MDC_DM_TBR_REASON_ILLNESS _instance = new MDC_DM_TBR_REASON_ILLNESS("MDC_DM_TBR_REASON_ILLNESS", 29732, 128);

  private MDC_DM_TBR_REASON_ILLNESS(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_DM_TBR_REASON_ILLNESS get() {
    return _instance;
  }
}
