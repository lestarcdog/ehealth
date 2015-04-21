
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_DIM_MILLI_VOLT extends MdcNomenclatureValue {

  private static final MDC_DIM_MILLI_VOLT _instance = new MDC_DIM_MILLI_VOLT("MDC_DIM_MILLI_VOLT", 4274, 4);

  private MDC_DIM_MILLI_VOLT(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_DIM_MILLI_VOLT get() {
    return _instance;
  }
}
