
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_DEV_SPEC_PROFILE_AI_MED_MINDER extends MdcNomenclatureValue {

  private static final MDC_DEV_SPEC_PROFILE_AI_MED_MINDER _instance = new MDC_DEV_SPEC_PROFILE_AI_MED_MINDER("MDC_DEV_SPEC_PROFILE_AI_MED_MINDER", 4168, 8);

  private MDC_DEV_SPEC_PROFILE_AI_MED_MINDER(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_DEV_SPEC_PROFILE_AI_MED_MINDER get() {
    return _instance;
  }
}
