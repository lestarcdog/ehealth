
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_DEV_SUB_SPEC_PROFILE_HR extends MdcNomenclatureValue {

  private static final MDC_DEV_SUB_SPEC_PROFILE_HR _instance = new MDC_DEV_SUB_SPEC_PROFILE_HR("MDC_DEV_SUB_SPEC_PROFILE_HR", 4237, 8);

  private MDC_DEV_SUB_SPEC_PROFILE_HR(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_DEV_SUB_SPEC_PROFILE_HR get() {
    return _instance;
  }
}
