
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_HF_EXERCISE_GRIP extends MdcNomenclatureValue {

  private static final MDC_HF_EXERCISE_GRIP _instance = new MDC_HF_EXERCISE_GRIP("MDC_HF_EXERCISE_GRIP", 206, 129);

  private MDC_HF_EXERCISE_GRIP(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_HF_EXERCISE_GRIP get() {
    return _instance;
  }
}
