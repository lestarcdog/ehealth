
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_DIM_X_WATT extends MdcNomenclatureValue {

  private static final MDC_DIM_X_WATT _instance = new MDC_DIM_X_WATT("MDC_DIM_X_WATT", 4032, 4);

  private MDC_DIM_X_WATT(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_DIM_X_WATT get() {
    return _instance;
  }
}
