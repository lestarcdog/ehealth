
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_DIM_X_INTL_UNIT extends MdcNomenclatureValue {

  private static final MDC_DIM_X_INTL_UNIT _instance = new MDC_DIM_X_INTL_UNIT("MDC_DIM_X_INTL_UNIT", 5472, 4);

  private MDC_DIM_X_INTL_UNIT(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_DIM_X_INTL_UNIT get() {
    return _instance;
  }
}
