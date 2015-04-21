
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_QUICK_VALUE_COAG extends MdcNomenclatureValue {

  private static final MDC_QUICK_VALUE_COAG _instance = new MDC_QUICK_VALUE_COAG("MDC_QUICK_VALUE_COAG", 29196, 2);

  private MDC_QUICK_VALUE_COAG(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_QUICK_VALUE_COAG get() {
    return _instance;
  }
}
