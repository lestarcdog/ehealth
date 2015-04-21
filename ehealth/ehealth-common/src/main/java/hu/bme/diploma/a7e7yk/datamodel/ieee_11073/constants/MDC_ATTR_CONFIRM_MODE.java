
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_ATTR_CONFIRM_MODE extends MdcNomenclatureValue {

  private static final MDC_ATTR_CONFIRM_MODE _instance = new MDC_ATTR_CONFIRM_MODE("MDC_ATTR_CONFIRM_MODE", 2323, 1);

  private MDC_ATTR_CONFIRM_MODE(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_ATTR_CONFIRM_MODE get() {
    return _instance;
  }
}
