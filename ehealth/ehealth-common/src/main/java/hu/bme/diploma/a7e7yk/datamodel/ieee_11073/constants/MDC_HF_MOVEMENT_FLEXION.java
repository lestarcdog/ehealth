
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_HF_MOVEMENT_FLEXION extends MdcNomenclatureValue {

  private static final MDC_HF_MOVEMENT_FLEXION _instance = new MDC_HF_MOVEMENT_FLEXION("MDC_HF_MOVEMENT_FLEXION", 1300, 129);

  private MDC_HF_MOVEMENT_FLEXION(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_HF_MOVEMENT_FLEXION get() {
    return _instance;
  }
}
