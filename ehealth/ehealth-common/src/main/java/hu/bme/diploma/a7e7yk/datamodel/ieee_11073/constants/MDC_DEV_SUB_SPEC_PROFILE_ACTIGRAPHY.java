
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_DEV_SUB_SPEC_PROFILE_ACTIGRAPHY extends MdcNomenclatureValue {

  private static final MDC_DEV_SUB_SPEC_PROFILE_ACTIGRAPHY _instance = new MDC_DEV_SUB_SPEC_PROFILE_ACTIGRAPHY("MDC_DEV_SUB_SPEC_PROFILE_ACTIGRAPHY", 4200, 8);

  private MDC_DEV_SUB_SPEC_PROFILE_ACTIGRAPHY(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_DEV_SUB_SPEC_PROFILE_ACTIGRAPHY get() {
    return _instance;
  }
}
