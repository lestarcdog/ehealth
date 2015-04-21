
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_ATTR_SYS_TYPE extends MdcNomenclatureValue {

  private static final MDC_ATTR_SYS_TYPE _instance = new MDC_ATTR_SYS_TYPE("MDC_ATTR_SYS_TYPE", 2438, 1);

  private MDC_ATTR_SYS_TYPE(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_ATTR_SYS_TYPE get() {
    return _instance;
  }
}
