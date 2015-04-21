
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_DEV_SPEC_PROFILE_COAG extends MdcNomenclatureValue {

  private static final MDC_DEV_SPEC_PROFILE_COAG _instance = new MDC_DEV_SPEC_PROFILE_COAG("MDC_DEV_SPEC_PROFILE_COAG", 4114, 8);

  private MDC_DEV_SPEC_PROFILE_COAG(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_DEV_SPEC_PROFILE_COAG get() {
    return _instance;
  }
}
