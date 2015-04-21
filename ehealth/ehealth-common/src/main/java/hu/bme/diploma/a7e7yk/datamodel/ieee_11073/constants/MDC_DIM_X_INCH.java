
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_DIM_X_INCH extends MdcNomenclatureValue {

  private static final MDC_DIM_X_INCH _instance = new MDC_DIM_X_INCH("MDC_DIM_X_INCH", 1376, 4);

  private MDC_DIM_X_INCH(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_DIM_X_INCH get() {
    return _instance;
  }
}
