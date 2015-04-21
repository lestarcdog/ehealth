
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_TEMP_RECT extends MdcNomenclatureValue {

  private static final MDC_TEMP_RECT _instance = new MDC_TEMP_RECT("MDC_TEMP_RECT", 57348, 2);

  private MDC_TEMP_RECT(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_TEMP_RECT get() {
    return _instance;
  }
}
