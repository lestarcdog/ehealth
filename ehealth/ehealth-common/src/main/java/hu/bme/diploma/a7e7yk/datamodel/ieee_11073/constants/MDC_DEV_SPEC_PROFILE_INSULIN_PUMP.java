
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_DEV_SPEC_PROFILE_INSULIN_PUMP extends MdcNomenclatureValue {

  private static final MDC_DEV_SPEC_PROFILE_INSULIN_PUMP _instance = new MDC_DEV_SPEC_PROFILE_INSULIN_PUMP("MDC_DEV_SPEC_PROFILE_INSULIN_PUMP", 4115, 8);

  private MDC_DEV_SPEC_PROFILE_INSULIN_PUMP(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_DEV_SPEC_PROFILE_INSULIN_PUMP get() {
    return _instance;
  }
}
