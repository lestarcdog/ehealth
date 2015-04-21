
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_DEV_SPEC_PROFILE_AI_ACTIVITY_HUB extends MdcNomenclatureValue {

  private static final MDC_DEV_SPEC_PROFILE_AI_ACTIVITY_HUB _instance = new MDC_DEV_SPEC_PROFILE_AI_ACTIVITY_HUB("MDC_DEV_SPEC_PROFILE_AI_ACTIVITY_HUB", 4167, 8);

  private MDC_DEV_SPEC_PROFILE_AI_ACTIVITY_HUB(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_DEV_SPEC_PROFILE_AI_ACTIVITY_HUB get() {
    return _instance;
  }
}
