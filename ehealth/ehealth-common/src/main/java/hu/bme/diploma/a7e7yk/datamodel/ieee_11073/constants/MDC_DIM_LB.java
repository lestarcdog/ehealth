
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_DIM_LB extends MdcNomenclatureValue {

  private static final MDC_DIM_LB _instance = new MDC_DIM_LB("MDC_DIM_LB", 1760, 4);

  private MDC_DIM_LB(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_DIM_LB get() {
    return _instance;
  }
}
