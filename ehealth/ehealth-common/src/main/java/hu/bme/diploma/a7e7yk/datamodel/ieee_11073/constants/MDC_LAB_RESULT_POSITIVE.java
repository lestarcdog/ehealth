
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_LAB_RESULT_POSITIVE extends MdcNomenclatureValue {

  private static final MDC_LAB_RESULT_POSITIVE _instance = new MDC_LAB_RESULT_POSITIVE("MDC_LAB_RESULT_POSITIVE", 57677, 128);

  private MDC_LAB_RESULT_POSITIVE(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_LAB_RESULT_POSITIVE get() {
    return _instance;
  }
}
