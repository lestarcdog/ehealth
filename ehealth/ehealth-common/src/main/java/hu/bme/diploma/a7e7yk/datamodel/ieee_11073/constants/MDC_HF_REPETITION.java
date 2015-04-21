
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_HF_REPETITION extends MdcNomenclatureValue {

  private static final MDC_HF_REPETITION _instance = new MDC_HF_REPETITION("MDC_HF_REPETITION", 201, 129);

  private MDC_HF_REPETITION(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_HF_REPETITION get() {
    return _instance;
  }
}
