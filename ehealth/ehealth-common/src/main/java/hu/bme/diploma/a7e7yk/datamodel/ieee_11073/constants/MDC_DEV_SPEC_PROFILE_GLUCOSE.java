
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_DEV_SPEC_PROFILE_GLUCOSE extends MdcNomenclatureValue {

  private static final MDC_DEV_SPEC_PROFILE_GLUCOSE _instance = new MDC_DEV_SPEC_PROFILE_GLUCOSE("MDC_DEV_SPEC_PROFILE_GLUCOSE", 4113, 8);

  private MDC_DEV_SPEC_PROFILE_GLUCOSE(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_DEV_SPEC_PROFILE_GLUCOSE get() {
    return _instance;
  }
}
