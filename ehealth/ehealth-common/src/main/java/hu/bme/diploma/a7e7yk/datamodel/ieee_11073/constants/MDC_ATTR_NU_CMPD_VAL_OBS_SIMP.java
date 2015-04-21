
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_ATTR_NU_CMPD_VAL_OBS_SIMP extends MdcNomenclatureValue {

  private static final MDC_ATTR_NU_CMPD_VAL_OBS_SIMP _instance = new MDC_ATTR_NU_CMPD_VAL_OBS_SIMP("MDC_ATTR_NU_CMPD_VAL_OBS_SIMP", 2676, 1);

  private MDC_ATTR_NU_CMPD_VAL_OBS_SIMP(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_ATTR_NU_CMPD_VAL_OBS_SIMP get() {
    return _instance;
  }
}
