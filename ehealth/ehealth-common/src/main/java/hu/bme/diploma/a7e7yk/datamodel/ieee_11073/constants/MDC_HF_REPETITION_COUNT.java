
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_HF_REPETITION_COUNT extends MdcNomenclatureValue {

  private static final MDC_HF_REPETITION_COUNT _instance = new MDC_HF_REPETITION_COUNT("MDC_HF_REPETITION_COUNT", 202, 129);

  private MDC_HF_REPETITION_COUNT(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_HF_REPETITION_COUNT get() {
    return _instance;
  }
}
