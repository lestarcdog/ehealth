
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_UPEXT_BRACHI_BICEPS extends MdcNomenclatureValue {

  private static final MDC_MUSC_UPEXT_BRACHI_BICEPS _instance = new MDC_MUSC_UPEXT_BRACHI_BICEPS("MDC_MUSC_UPEXT_BRACHI_BICEPS", 628, 7);

  private MDC_MUSC_UPEXT_BRACHI_BICEPS(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_UPEXT_BRACHI_BICEPS get() {
    return _instance;
  }
}
