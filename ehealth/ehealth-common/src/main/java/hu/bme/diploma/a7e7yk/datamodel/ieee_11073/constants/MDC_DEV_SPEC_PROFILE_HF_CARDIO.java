
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_DEV_SPEC_PROFILE_HF_CARDIO extends MdcNomenclatureValue {

  private static final MDC_DEV_SPEC_PROFILE_HF_CARDIO _instance = new MDC_DEV_SPEC_PROFILE_HF_CARDIO("MDC_DEV_SPEC_PROFILE_HF_CARDIO", 4137, 8);

  private MDC_DEV_SPEC_PROFILE_HF_CARDIO(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_DEV_SPEC_PROFILE_HF_CARDIO get() {
    return _instance;
  }
}
