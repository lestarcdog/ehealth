
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_DEV_SPEC_PROFILE_CGM extends MdcNomenclatureValue {

  private static final MDC_DEV_SPEC_PROFILE_CGM _instance = new MDC_DEV_SPEC_PROFILE_CGM("MDC_DEV_SPEC_PROFILE_CGM", 4122, 8);

  private MDC_DEV_SPEC_PROFILE_CGM(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_DEV_SPEC_PROFILE_CGM get() {
    return _instance;
  }
}
