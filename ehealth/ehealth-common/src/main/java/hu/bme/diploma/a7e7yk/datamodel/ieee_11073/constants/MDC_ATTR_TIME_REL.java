
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_ATTR_TIME_REL extends MdcNomenclatureValue {

  private static final MDC_ATTR_TIME_REL _instance = new MDC_ATTR_TIME_REL("MDC_ATTR_TIME_REL", 2447, 1);

  private MDC_ATTR_TIME_REL(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_ATTR_TIME_REL get() {
    return _instance;
  }
}
