
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_HF_MOVEMENT_ADDUCTION extends MdcNomenclatureValue {

  private static final MDC_HF_MOVEMENT_ADDUCTION _instance = new MDC_HF_MOVEMENT_ADDUCTION("MDC_HF_MOVEMENT_ADDUCTION", 1304, 129);

  private MDC_HF_MOVEMENT_ADDUCTION(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_HF_MOVEMENT_ADDUCTION get() {
    return _instance;
  }
}
