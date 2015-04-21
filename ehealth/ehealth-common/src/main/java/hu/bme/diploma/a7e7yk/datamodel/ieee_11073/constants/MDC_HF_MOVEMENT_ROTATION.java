
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_HF_MOVEMENT_ROTATION extends MdcNomenclatureValue {

  private static final MDC_HF_MOVEMENT_ROTATION _instance = new MDC_HF_MOVEMENT_ROTATION("MDC_HF_MOVEMENT_ROTATION", 1302, 129);

  private MDC_HF_MOVEMENT_ROTATION(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_HF_MOVEMENT_ROTATION get() {
    return _instance;
  }
}
