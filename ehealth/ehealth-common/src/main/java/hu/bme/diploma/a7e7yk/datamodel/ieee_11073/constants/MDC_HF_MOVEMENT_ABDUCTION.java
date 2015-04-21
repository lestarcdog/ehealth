
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_HF_MOVEMENT_ABDUCTION extends MdcNomenclatureValue {

  private static final MDC_HF_MOVEMENT_ABDUCTION _instance = new MDC_HF_MOVEMENT_ABDUCTION("MDC_HF_MOVEMENT_ABDUCTION", 1303, 129);

  private MDC_HF_MOVEMENT_ABDUCTION(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_HF_MOVEMENT_ABDUCTION get() {
    return _instance;
  }
}
