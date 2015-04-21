
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_ATTR_NUM_SEG extends MdcNomenclatureValue {

  private static final MDC_ATTR_NUM_SEG _instance = new MDC_ATTR_NUM_SEG("MDC_ATTR_NUM_SEG", 2385, 1);

  private MDC_ATTR_NUM_SEG(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_ATTR_NUM_SEG get() {
    return _instance;
  }
}
