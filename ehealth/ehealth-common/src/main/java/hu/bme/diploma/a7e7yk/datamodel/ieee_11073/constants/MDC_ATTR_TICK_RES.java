
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_ATTR_TICK_RES extends MdcNomenclatureValue {

  private static final MDC_ATTR_TICK_RES _instance = new MDC_ATTR_TICK_RES("MDC_ATTR_TICK_RES", 2693, 1);

  private MDC_ATTR_TICK_RES(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_ATTR_TICK_RES get() {
    return _instance;
  }
}
