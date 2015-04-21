
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_LAB_RESULT_NEGATIVE extends MdcNomenclatureValue {

  private static final MDC_LAB_RESULT_NEGATIVE _instance = new MDC_LAB_RESULT_NEGATIVE("MDC_LAB_RESULT_NEGATIVE", 57676, 128);

  private MDC_LAB_RESULT_NEGATIVE(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_LAB_RESULT_NEGATIVE get() {
    return _instance;
  }
}
