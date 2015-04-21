
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_DIM_DIMLESS extends MdcNomenclatureValue {

  private static final MDC_DIM_DIMLESS _instance = new MDC_DIM_DIMLESS("MDC_DIM_DIMLESS", 512, 4);

  private MDC_DIM_DIMLESS(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_DIM_DIMLESS get() {
    return _instance;
  }
}
