
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_DEV_SUB_SPEC_PROFILE_ECG extends MdcNomenclatureValue {

  private static final MDC_DEV_SUB_SPEC_PROFILE_ECG _instance = new MDC_DEV_SUB_SPEC_PROFILE_ECG("MDC_DEV_SUB_SPEC_PROFILE_ECG", 4236, 8);

  private MDC_DEV_SUB_SPEC_PROFILE_ECG(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_DEV_SUB_SPEC_PROFILE_ECG get() {
    return _instance;
  }
}
