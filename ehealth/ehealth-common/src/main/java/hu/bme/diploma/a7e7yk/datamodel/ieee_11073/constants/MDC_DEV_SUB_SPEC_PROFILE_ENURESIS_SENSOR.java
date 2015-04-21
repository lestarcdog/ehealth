
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_DEV_SUB_SPEC_PROFILE_ENURESIS_SENSOR extends MdcNomenclatureValue {

  private static final MDC_DEV_SUB_SPEC_PROFILE_ENURESIS_SENSOR _instance = new MDC_DEV_SUB_SPEC_PROFILE_ENURESIS_SENSOR("MDC_DEV_SUB_SPEC_PROFILE_ENURESIS_SENSOR", 4221, 8);

  private MDC_DEV_SUB_SPEC_PROFILE_ENURESIS_SENSOR(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_DEV_SUB_SPEC_PROFILE_ENURESIS_SENSOR get() {
    return _instance;
  }
}
