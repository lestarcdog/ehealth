
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_UPEXT_BRACH_TRICEPS_CAP_MED extends MdcNomenclatureValue {

  private static final MDC_MUSC_UPEXT_BRACH_TRICEPS_CAP_MED _instance = new MDC_MUSC_UPEXT_BRACH_TRICEPS_CAP_MED("MDC_MUSC_UPEXT_BRACH_TRICEPS_CAP_MED", 652, 7);

  private MDC_MUSC_UPEXT_BRACH_TRICEPS_CAP_MED(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_UPEXT_BRACH_TRICEPS_CAP_MED get() {
    return _instance;
  }
}
