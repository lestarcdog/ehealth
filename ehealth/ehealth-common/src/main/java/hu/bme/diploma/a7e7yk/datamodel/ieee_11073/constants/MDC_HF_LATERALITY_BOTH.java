
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_HF_LATERALITY_BOTH extends MdcNomenclatureValue {

  private static final MDC_HF_LATERALITY_BOTH _instance = new MDC_HF_LATERALITY_BOTH("MDC_HF_LATERALITY_BOTH", 1200, 129);

  private MDC_HF_LATERALITY_BOTH(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_HF_LATERALITY_BOTH get() {
    return _instance;
  }
}
