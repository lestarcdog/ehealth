
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_DIM_X_FOOT extends MdcNomenclatureValue {

  private static final MDC_DIM_X_FOOT _instance = new MDC_DIM_X_FOOT("MDC_DIM_X_FOOT", 1344, 4);

  private MDC_DIM_X_FOOT(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_DIM_X_FOOT get() {
    return _instance;
  }
}
