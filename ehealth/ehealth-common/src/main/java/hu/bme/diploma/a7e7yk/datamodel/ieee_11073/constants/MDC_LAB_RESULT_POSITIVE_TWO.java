
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_LAB_RESULT_POSITIVE_TWO extends MdcNomenclatureValue {

  private static final MDC_LAB_RESULT_POSITIVE_TWO _instance = new MDC_LAB_RESULT_POSITIVE_TWO("MDC_LAB_RESULT_POSITIVE_TWO", 57679, 128);

  private MDC_LAB_RESULT_POSITIVE_TWO(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_LAB_RESULT_POSITIVE_TWO get() {
    return _instance;
  }
}
