
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_DEV_SPEC_PROFILE_SLEEP_QUALITY extends MdcNomenclatureValue {

  private static final MDC_DEV_SPEC_PROFILE_SLEEP_QUALITY _instance = new MDC_DEV_SPEC_PROFILE_SLEEP_QUALITY("MDC_DEV_SPEC_PROFILE_SLEEP_QUALITY", 4120, 8);

  private MDC_DEV_SPEC_PROFILE_SLEEP_QUALITY(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_DEV_SPEC_PROFILE_SLEEP_QUALITY get() {
    return _instance;
  }
}
