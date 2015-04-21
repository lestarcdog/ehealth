
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_DIM_X_M extends MdcNomenclatureValue {

  private static final MDC_DIM_X_M _instance = new MDC_DIM_X_M("MDC_DIM_X_M", 1280, 4);

  private MDC_DIM_X_M(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_DIM_X_M get() {
    return _instance;
  }
}
