
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_DIM_MILLI_G_PER_DL extends MdcNomenclatureValue {

  private static final MDC_DIM_MILLI_G_PER_DL _instance = new MDC_DIM_MILLI_G_PER_DL("MDC_DIM_MILLI_G_PER_DL", 2130, 4);

  private MDC_DIM_MILLI_G_PER_DL(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_DIM_MILLI_G_PER_DL get() {
    return _instance;
  }
}
