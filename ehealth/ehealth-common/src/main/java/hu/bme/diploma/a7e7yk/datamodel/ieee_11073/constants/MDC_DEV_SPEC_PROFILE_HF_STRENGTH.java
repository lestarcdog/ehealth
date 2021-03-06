
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_DEV_SPEC_PROFILE_HF_STRENGTH extends MdcNomenclatureValue {

  private static final MDC_DEV_SPEC_PROFILE_HF_STRENGTH _instance = new MDC_DEV_SPEC_PROFILE_HF_STRENGTH("MDC_DEV_SPEC_PROFILE_HF_STRENGTH", 4138, 8);

  private MDC_DEV_SPEC_PROFILE_HF_STRENGTH(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_DEV_SPEC_PROFILE_HF_STRENGTH get() {
    return _instance;
  }
}
