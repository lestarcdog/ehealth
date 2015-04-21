
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_DIM_YR extends MdcNomenclatureValue {

  private static final MDC_DIM_YR _instance = new MDC_DIM_YR("MDC_DIM_YR", 2368, 4);

  private MDC_DIM_YR(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_DIM_YR get() {
    return _instance;
  }
}
