
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_ATTR_TIME_RES_HI_REL extends MdcNomenclatureValue {

  private static final MDC_ATTR_TIME_RES_HI_REL _instance = new MDC_ATTR_TIME_RES_HI_REL("MDC_ATTR_TIME_RES_HI_REL", 2688, 1);

  private MDC_ATTR_TIME_RES_HI_REL(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_ATTR_TIME_RES_HI_REL get() {
    return _instance;
  }
}
