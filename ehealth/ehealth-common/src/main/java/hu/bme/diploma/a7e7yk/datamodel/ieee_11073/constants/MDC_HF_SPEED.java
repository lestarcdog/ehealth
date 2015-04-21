
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_HF_SPEED extends MdcNomenclatureValue {

  private static final MDC_HF_SPEED _instance = new MDC_HF_SPEED("MDC_HF_SPEED", 110, 129);

  private MDC_HF_SPEED(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_HF_SPEED get() {
    return _instance;
  }
}
