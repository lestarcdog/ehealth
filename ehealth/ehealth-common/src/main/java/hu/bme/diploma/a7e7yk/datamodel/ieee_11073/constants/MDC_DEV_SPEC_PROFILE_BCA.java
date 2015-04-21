
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_DEV_SPEC_PROFILE_BCA extends MdcNomenclatureValue {

  private static final MDC_DEV_SPEC_PROFILE_BCA _instance = new MDC_DEV_SPEC_PROFILE_BCA("MDC_DEV_SPEC_PROFILE_BCA", 4116, 8);

  private MDC_DEV_SPEC_PROFILE_BCA(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_DEV_SPEC_PROFILE_BCA get() {
    return _instance;
  }
}
