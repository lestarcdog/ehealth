
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_UPEXT_BRACH_TRICEPS_CAP_LONG extends MdcNomenclatureValue {

  private static final MDC_MUSC_UPEXT_BRACH_TRICEPS_CAP_LONG _instance = new MDC_MUSC_UPEXT_BRACH_TRICEPS_CAP_LONG("MDC_MUSC_UPEXT_BRACH_TRICEPS_CAP_LONG", 644, 7);

  private MDC_MUSC_UPEXT_BRACH_TRICEPS_CAP_LONG(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_UPEXT_BRACH_TRICEPS_CAP_LONG get() {
    return _instance;
  }
}
