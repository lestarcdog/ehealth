
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_DEV_SPEC_PROFILE_SCALE extends MdcNomenclatureValue {

  private static final MDC_DEV_SPEC_PROFILE_SCALE _instance = new MDC_DEV_SPEC_PROFILE_SCALE("MDC_DEV_SPEC_PROFILE_SCALE", 4111, 8);

  private MDC_DEV_SPEC_PROFILE_SCALE(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_DEV_SPEC_PROFILE_SCALE get() {
    return _instance;
  }
}
