
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_UPEXT_BRACH_TRICEPS extends MdcNomenclatureValue {

  private static final MDC_MUSC_UPEXT_BRACH_TRICEPS _instance = new MDC_MUSC_UPEXT_BRACH_TRICEPS("MDC_MUSC_UPEXT_BRACH_TRICEPS", 640, 7);

  private MDC_MUSC_UPEXT_BRACH_TRICEPS(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_UPEXT_BRACH_TRICEPS get() {
    return _instance;
  }
}
