
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_ATTR_SYS_TYPE_SPEC_LIST extends MdcNomenclatureValue {

  private static final MDC_ATTR_SYS_TYPE_SPEC_LIST _instance = new MDC_ATTR_SYS_TYPE_SPEC_LIST("MDC_ATTR_SYS_TYPE_SPEC_LIST", 2650, 1);

  private MDC_ATTR_SYS_TYPE_SPEC_LIST(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_ATTR_SYS_TYPE_SPEC_LIST get() {
    return _instance;
  }
}
