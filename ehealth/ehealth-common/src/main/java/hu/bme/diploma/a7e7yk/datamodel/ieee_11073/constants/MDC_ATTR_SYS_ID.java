
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_ATTR_SYS_ID extends MdcNomenclatureValue {

  private static final MDC_ATTR_SYS_ID _instance = new MDC_ATTR_SYS_ID("MDC_ATTR_SYS_ID", 2436, 1);

  private MDC_ATTR_SYS_ID(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_ATTR_SYS_ID get() {
    return _instance;
  }
}
