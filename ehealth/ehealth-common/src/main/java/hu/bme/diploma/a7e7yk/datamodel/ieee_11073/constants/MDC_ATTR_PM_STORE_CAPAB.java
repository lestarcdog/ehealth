
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_ATTR_PM_STORE_CAPAB extends MdcNomenclatureValue {

  private static final MDC_ATTR_PM_STORE_CAPAB _instance = new MDC_ATTR_PM_STORE_CAPAB("MDC_ATTR_PM_STORE_CAPAB", 2637, 1);

  private MDC_ATTR_PM_STORE_CAPAB(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_ATTR_PM_STORE_CAPAB get() {
    return _instance;
  }
}
