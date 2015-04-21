
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_ATTR_NU_VAL_OBS_BASIC extends MdcNomenclatureValue {

  private static final MDC_ATTR_NU_VAL_OBS_BASIC _instance = new MDC_ATTR_NU_VAL_OBS_BASIC("MDC_ATTR_NU_VAL_OBS_BASIC", 2636, 1);

  private MDC_ATTR_NU_VAL_OBS_BASIC(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_ATTR_NU_VAL_OBS_BASIC get() {
    return _instance;
  }
}
