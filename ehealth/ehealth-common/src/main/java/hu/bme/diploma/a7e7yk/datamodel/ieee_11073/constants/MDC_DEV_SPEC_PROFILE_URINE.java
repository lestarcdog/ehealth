
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_DEV_SPEC_PROFILE_URINE extends MdcNomenclatureValue {

  private static final MDC_DEV_SPEC_PROFILE_URINE _instance = new MDC_DEV_SPEC_PROFILE_URINE("MDC_DEV_SPEC_PROFILE_URINE", 4118, 8);

  private MDC_DEV_SPEC_PROFILE_URINE(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_DEV_SPEC_PROFILE_URINE get() {
    return _instance;
  }
}
