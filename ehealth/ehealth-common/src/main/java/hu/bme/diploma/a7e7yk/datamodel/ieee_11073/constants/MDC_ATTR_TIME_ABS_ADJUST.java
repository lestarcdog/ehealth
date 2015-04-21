
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_ATTR_TIME_ABS_ADJUST extends MdcNomenclatureValue {

  private static final MDC_ATTR_TIME_ABS_ADJUST _instance = new MDC_ATTR_TIME_ABS_ADJUST("MDC_ATTR_TIME_ABS_ADJUST", 2658, 1);

  private MDC_ATTR_TIME_ABS_ADJUST(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_ATTR_TIME_ABS_ADJUST get() {
    return _instance;
  }
}
