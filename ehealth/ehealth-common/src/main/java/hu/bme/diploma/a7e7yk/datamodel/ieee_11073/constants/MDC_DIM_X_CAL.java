
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_DIM_X_CAL extends MdcNomenclatureValue {

  private static final MDC_DIM_X_CAL _instance = new MDC_DIM_X_CAL("MDC_DIM_X_CAL", 6784, 4);

  private MDC_DIM_X_CAL(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_DIM_X_CAL get() {
    return _instance;
  }
}
