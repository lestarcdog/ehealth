
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_HF_LATERALITY_RIGHT extends MdcNomenclatureValue {

  private static final MDC_HF_LATERALITY_RIGHT _instance = new MDC_HF_LATERALITY_RIGHT("MDC_HF_LATERALITY_RIGHT", 1201, 129);

  private MDC_HF_LATERALITY_RIGHT(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_HF_LATERALITY_RIGHT get() {
    return _instance;
  }
}
