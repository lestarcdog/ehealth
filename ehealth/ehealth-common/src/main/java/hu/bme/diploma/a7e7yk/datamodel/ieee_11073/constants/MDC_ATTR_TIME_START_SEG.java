
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_ATTR_TIME_START_SEG extends MdcNomenclatureValue {

  private static final MDC_ATTR_TIME_START_SEG _instance = new MDC_ATTR_TIME_START_SEG("MDC_ATTR_TIME_START_SEG", 2450, 1);

  private MDC_ATTR_TIME_START_SEG(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_ATTR_TIME_START_SEG get() {
    return _instance;
  }
}
