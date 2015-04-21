
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_ATTR_VAL_ENUM_OBS extends MdcNomenclatureValue {

  private static final MDC_ATTR_VAL_ENUM_OBS _instance = new MDC_ATTR_VAL_ENUM_OBS("MDC_ATTR_VAL_ENUM_OBS", 2462, 1);

  private MDC_ATTR_VAL_ENUM_OBS(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_ATTR_VAL_ENUM_OBS get() {
    return _instance;
  }
}
