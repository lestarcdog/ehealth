
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_LAB_RESULT_POSITIVE_FOUR extends MdcNomenclatureValue {

  private static final MDC_LAB_RESULT_POSITIVE_FOUR _instance = new MDC_LAB_RESULT_POSITIVE_FOUR("MDC_LAB_RESULT_POSITIVE_FOUR", 57681, 128);

  private MDC_LAB_RESULT_POSITIVE_FOUR(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_LAB_RESULT_POSITIVE_FOUR get() {
    return _instance;
  }
}
