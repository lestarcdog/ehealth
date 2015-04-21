
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_ATTR_ENUM_OBS_VAL_SIMP_STR extends MdcNomenclatureValue {

  private static final MDC_ATTR_ENUM_OBS_VAL_SIMP_STR _instance = new MDC_ATTR_ENUM_OBS_VAL_SIMP_STR("MDC_ATTR_ENUM_OBS_VAL_SIMP_STR", 2634, 1);

  private MDC_ATTR_ENUM_OBS_VAL_SIMP_STR(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_ATTR_ENUM_OBS_VAL_SIMP_STR get() {
    return _instance;
  }
}
