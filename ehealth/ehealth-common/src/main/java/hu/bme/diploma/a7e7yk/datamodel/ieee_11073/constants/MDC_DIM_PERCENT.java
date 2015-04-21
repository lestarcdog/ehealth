
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_DIM_PERCENT extends MdcNomenclatureValue {

  private static final MDC_DIM_PERCENT _instance = new MDC_DIM_PERCENT("MDC_DIM_PERCENT", 544, 4);

  private MDC_DIM_PERCENT(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_DIM_PERCENT get() {
    return _instance;
  }
}
