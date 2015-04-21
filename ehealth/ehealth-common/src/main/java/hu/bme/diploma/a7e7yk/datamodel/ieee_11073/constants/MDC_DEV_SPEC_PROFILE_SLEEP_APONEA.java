
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_DEV_SPEC_PROFILE_SLEEP_APONEA extends MdcNomenclatureValue {

  private static final MDC_DEV_SPEC_PROFILE_SLEEP_APONEA _instance = new MDC_DEV_SPEC_PROFILE_SLEEP_APONEA("MDC_DEV_SPEC_PROFILE_SLEEP_APONEA", 4121, 8);

  private MDC_DEV_SPEC_PROFILE_SLEEP_APONEA(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_DEV_SPEC_PROFILE_SLEEP_APONEA get() {
    return _instance;
  }
}
