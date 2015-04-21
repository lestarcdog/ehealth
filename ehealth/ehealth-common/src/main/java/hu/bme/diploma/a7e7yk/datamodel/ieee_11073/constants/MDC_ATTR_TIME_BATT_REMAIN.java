
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_ATTR_TIME_BATT_REMAIN extends MdcNomenclatureValue {

  private static final MDC_ATTR_TIME_BATT_REMAIN _instance = new MDC_ATTR_TIME_BATT_REMAIN("MDC_ATTR_TIME_BATT_REMAIN", 2440, 1);

  private MDC_ATTR_TIME_BATT_REMAIN(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_ATTR_TIME_BATT_REMAIN get() {
    return _instance;
  }
}
