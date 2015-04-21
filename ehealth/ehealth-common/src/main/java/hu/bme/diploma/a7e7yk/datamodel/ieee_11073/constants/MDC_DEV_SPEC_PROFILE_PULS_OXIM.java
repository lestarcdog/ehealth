
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_DEV_SPEC_PROFILE_PULS_OXIM extends MdcNomenclatureValue {

  private static final MDC_DEV_SPEC_PROFILE_PULS_OXIM _instance = new MDC_DEV_SPEC_PROFILE_PULS_OXIM("MDC_DEV_SPEC_PROFILE_PULS_OXIM", 4100, 8);

  private MDC_DEV_SPEC_PROFILE_PULS_OXIM(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_DEV_SPEC_PROFILE_PULS_OXIM get() {
    return _instance;
  }
}
