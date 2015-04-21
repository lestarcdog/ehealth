
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_BACK_SPLEN_CAPT extends MdcNomenclatureValue {

  private static final MDC_MUSC_BACK_SPLEN_CAPT _instance = new MDC_MUSC_BACK_SPLEN_CAPT("MDC_MUSC_BACK_SPLEN_CAPT", 460, 7);

  private MDC_MUSC_BACK_SPLEN_CAPT(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_BACK_SPLEN_CAPT get() {
    return _instance;
  }
}
