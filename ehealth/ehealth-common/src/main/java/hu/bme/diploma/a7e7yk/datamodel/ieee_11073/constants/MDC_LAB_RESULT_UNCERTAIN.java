
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_LAB_RESULT_UNCERTAIN extends MdcNomenclatureValue {

  private static final MDC_LAB_RESULT_UNCERTAIN _instance = new MDC_LAB_RESULT_UNCERTAIN("MDC_LAB_RESULT_UNCERTAIN", 57682, 128);

  private MDC_LAB_RESULT_UNCERTAIN(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_LAB_RESULT_UNCERTAIN get() {
    return _instance;
  }
}
