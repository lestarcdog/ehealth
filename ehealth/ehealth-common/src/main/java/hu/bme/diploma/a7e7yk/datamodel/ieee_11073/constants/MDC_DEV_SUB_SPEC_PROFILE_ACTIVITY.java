
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_DEV_SUB_SPEC_PROFILE_ACTIVITY extends MdcNomenclatureValue {

  private static final MDC_DEV_SUB_SPEC_PROFILE_ACTIVITY _instance = new MDC_DEV_SUB_SPEC_PROFILE_ACTIVITY("MDC_DEV_SUB_SPEC_PROFILE_ACTIVITY", 4200, 8);

  private MDC_DEV_SUB_SPEC_PROFILE_ACTIVITY(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_DEV_SUB_SPEC_PROFILE_ACTIVITY get() {
    return _instance;
  }
}
