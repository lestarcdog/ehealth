
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_ATTR_LIMIT_CURR extends MdcNomenclatureValue {

  private static final MDC_ATTR_LIMIT_CURR _instance = new MDC_ATTR_LIMIT_CURR("MDC_ATTR_LIMIT_CURR", 2356, 1);

  private MDC_ATTR_LIMIT_CURR(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_ATTR_LIMIT_CURR get() {
    return _instance;
  }
}
