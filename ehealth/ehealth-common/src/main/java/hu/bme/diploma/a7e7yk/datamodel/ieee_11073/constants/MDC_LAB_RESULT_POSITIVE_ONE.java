
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_LAB_RESULT_POSITIVE_ONE extends MdcNomenclatureValue {

  private static final MDC_LAB_RESULT_POSITIVE_ONE _instance = new MDC_LAB_RESULT_POSITIVE_ONE("MDC_LAB_RESULT_POSITIVE_ONE", 57678, 128);

  private MDC_LAB_RESULT_POSITIVE_ONE(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_LAB_RESULT_POSITIVE_ONE get() {
    return _instance;
  }
}
