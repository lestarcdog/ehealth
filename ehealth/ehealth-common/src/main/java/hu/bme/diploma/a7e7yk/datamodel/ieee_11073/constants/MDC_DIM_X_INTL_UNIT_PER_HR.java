
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_DIM_X_INTL_UNIT_PER_HR extends MdcNomenclatureValue {

  private static final MDC_DIM_X_INTL_UNIT_PER_HR _instance = new MDC_DIM_X_INTL_UNIT_PER_HR("MDC_DIM_X_INTL_UNIT_PER_HR", 5696, 4);

  private MDC_DIM_X_INTL_UNIT_PER_HR(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_DIM_X_INTL_UNIT_PER_HR get() {
    return _instance;
  }
}
