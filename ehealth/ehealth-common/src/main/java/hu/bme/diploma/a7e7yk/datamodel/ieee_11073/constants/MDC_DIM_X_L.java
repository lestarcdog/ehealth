
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_DIM_X_L extends MdcNomenclatureValue {

  private static final MDC_DIM_X_L _instance = new MDC_DIM_X_L("MDC_DIM_X_L", 1600, 4);

  private MDC_DIM_X_L(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_DIM_X_L get() {
    return _instance;
  }
}
