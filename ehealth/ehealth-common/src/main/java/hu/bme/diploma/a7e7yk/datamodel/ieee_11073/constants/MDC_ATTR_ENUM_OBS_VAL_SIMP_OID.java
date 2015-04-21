
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_ATTR_ENUM_OBS_VAL_SIMP_OID extends MdcNomenclatureValue {

  private static final MDC_ATTR_ENUM_OBS_VAL_SIMP_OID _instance = new MDC_ATTR_ENUM_OBS_VAL_SIMP_OID("MDC_ATTR_ENUM_OBS_VAL_SIMP_OID", 2633, 1);

  private MDC_ATTR_ENUM_OBS_VAL_SIMP_OID(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_ATTR_ENUM_OBS_VAL_SIMP_OID get() {
    return _instance;
  }
}
