
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_DEV_SUB_SPEC_PROFILE_STEP_COUNTER extends MdcNomenclatureValue {

  private static final MDC_DEV_SUB_SPEC_PROFILE_STEP_COUNTER _instance = new MDC_DEV_SUB_SPEC_PROFILE_STEP_COUNTER("MDC_DEV_SUB_SPEC_PROFILE_STEP_COUNTER", 4200, 8);

  private MDC_DEV_SUB_SPEC_PROFILE_STEP_COUNTER(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_DEV_SUB_SPEC_PROFILE_STEP_COUNTER get() {
    return _instance;
  }
}
