
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_ATTR_UNIT_CODE extends MdcNomenclatureValue {

  private static final MDC_ATTR_UNIT_CODE _instance = new MDC_ATTR_UNIT_CODE("MDC_ATTR_UNIT_CODE", 2454, 1);

  private MDC_ATTR_UNIT_CODE(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_ATTR_UNIT_CODE get() {
    return _instance;
  }
}
