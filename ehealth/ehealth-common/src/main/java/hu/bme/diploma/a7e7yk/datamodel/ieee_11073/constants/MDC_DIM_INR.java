
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_DIM_INR extends MdcNomenclatureValue {

  private static final MDC_DIM_INR _instance = new MDC_DIM_INR("MDC_DIM_INR", 6608, 4);

  private MDC_DIM_INR(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_DIM_INR get() {
    return _instance;
  }
}
