
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_ATTR_SOURCE_HANDLE_REF extends MdcNomenclatureValue {

  private static final MDC_ATTR_SOURCE_HANDLE_REF _instance = new MDC_ATTR_SOURCE_HANDLE_REF("MDC_ATTR_SOURCE_HANDLE_REF", 2631, 1);

  private MDC_ATTR_SOURCE_HANDLE_REF(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_ATTR_SOURCE_HANDLE_REF get() {
    return _instance;
  }
}
