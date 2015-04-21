
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_DIM_KILO_G extends MdcNomenclatureValue {

  private static final MDC_DIM_KILO_G _instance = new MDC_DIM_KILO_G("MDC_DIM_KILO_G", 1731, 4);

  private MDC_DIM_KILO_G(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_DIM_KILO_G get() {
    return _instance;
  }
}
