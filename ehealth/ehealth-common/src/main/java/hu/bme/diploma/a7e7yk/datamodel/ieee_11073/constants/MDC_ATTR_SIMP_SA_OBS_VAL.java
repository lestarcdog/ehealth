
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_ATTR_SIMP_SA_OBS_VAL extends MdcNomenclatureValue {

  private static final MDC_ATTR_SIMP_SA_OBS_VAL _instance = new MDC_ATTR_SIMP_SA_OBS_VAL("MDC_ATTR_SIMP_SA_OBS_VAL", 2632, 1);

  private MDC_ATTR_SIMP_SA_OBS_VAL(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_ATTR_SIMP_SA_OBS_VAL get() {
    return _instance;
  }
}
