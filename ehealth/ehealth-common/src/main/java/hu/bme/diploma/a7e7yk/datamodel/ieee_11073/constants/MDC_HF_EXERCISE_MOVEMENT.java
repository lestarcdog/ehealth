
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_HF_EXERCISE_MOVEMENT extends MdcNomenclatureValue {

  private static final MDC_HF_EXERCISE_MOVEMENT _instance = new MDC_HF_EXERCISE_MOVEMENT("MDC_HF_EXERCISE_MOVEMENT", 207, 129);

  private MDC_HF_EXERCISE_MOVEMENT(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_HF_EXERCISE_MOVEMENT get() {
    return _instance;
  }
}
