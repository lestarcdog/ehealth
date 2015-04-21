
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_ATTR_VAL_BATT_CHARGE extends MdcNomenclatureValue {

  private static final MDC_ATTR_VAL_BATT_CHARGE _instance = new MDC_ATTR_VAL_BATT_CHARGE("MDC_ATTR_VAL_BATT_CHARGE", 2460, 1);

  private MDC_ATTR_VAL_BATT_CHARGE(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_ATTR_VAL_BATT_CHARGE get() {
    return _instance;
  }
}
