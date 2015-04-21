
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_DIM_TICK extends MdcNomenclatureValue {

  private static final MDC_DIM_TICK _instance = new MDC_DIM_TICK("MDC_DIM_TICK", 6848, 4);

  private MDC_DIM_TICK(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_DIM_TICK get() {
    return _instance;
  }
}
