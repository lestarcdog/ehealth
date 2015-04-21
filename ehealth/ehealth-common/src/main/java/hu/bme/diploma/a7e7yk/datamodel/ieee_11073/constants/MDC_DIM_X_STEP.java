
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_DIM_X_STEP extends MdcNomenclatureValue {

  private static final MDC_DIM_X_STEP _instance = new MDC_DIM_X_STEP("MDC_DIM_X_STEP", 6656, 4);

  private MDC_DIM_X_STEP(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_DIM_X_STEP get() {
    return _instance;
  }
}
