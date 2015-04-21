
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_DEV_SPEC_PROFILE_TEMP extends MdcNomenclatureValue {

  private static final MDC_DEV_SPEC_PROFILE_TEMP _instance = new MDC_DEV_SPEC_PROFILE_TEMP("MDC_DEV_SPEC_PROFILE_TEMP", 4104, 8);

  private MDC_DEV_SPEC_PROFILE_TEMP(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_DEV_SPEC_PROFILE_TEMP get() {
    return _instance;
  }
}
