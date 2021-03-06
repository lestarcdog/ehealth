
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_HF_EXERCISE_POSITION extends MdcNomenclatureValue {

  private static final MDC_HF_EXERCISE_POSITION _instance = new MDC_HF_EXERCISE_POSITION("MDC_HF_EXERCISE_POSITION", 204, 129);

  private MDC_HF_EXERCISE_POSITION(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_HF_EXERCISE_POSITION get() {
    return _instance;
  }
}
