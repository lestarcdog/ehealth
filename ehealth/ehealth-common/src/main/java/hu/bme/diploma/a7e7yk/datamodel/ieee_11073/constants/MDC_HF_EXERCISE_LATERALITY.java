
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_HF_EXERCISE_LATERALITY extends MdcNomenclatureValue {

  private static final MDC_HF_EXERCISE_LATERALITY _instance = new MDC_HF_EXERCISE_LATERALITY("MDC_HF_EXERCISE_LATERALITY", 205, 129);

  private MDC_HF_EXERCISE_LATERALITY(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_HF_EXERCISE_LATERALITY get() {
    return _instance;
  }
}
