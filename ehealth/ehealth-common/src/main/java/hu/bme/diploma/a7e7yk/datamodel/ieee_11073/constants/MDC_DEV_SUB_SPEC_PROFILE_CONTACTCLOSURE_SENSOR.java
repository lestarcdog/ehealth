
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_DEV_SUB_SPEC_PROFILE_CONTACTCLOSURE_SENSOR extends MdcNomenclatureValue {

  private static final MDC_DEV_SUB_SPEC_PROFILE_CONTACTCLOSURE_SENSOR _instance = new MDC_DEV_SUB_SPEC_PROFILE_CONTACTCLOSURE_SENSOR("MDC_DEV_SUB_SPEC_PROFILE_CONTACTCLOSURE_SENSOR", 4222, 8);

  private MDC_DEV_SUB_SPEC_PROFILE_CONTACTCLOSURE_SENSOR(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_DEV_SUB_SPEC_PROFILE_CONTACTCLOSURE_SENSOR get() {
    return _instance;
  }
}
