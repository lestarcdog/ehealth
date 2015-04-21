
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_DIM_MIN extends MdcNomenclatureValue {

  private static final MDC_DIM_MIN _instance = new MDC_DIM_MIN("MDC_DIM_MIN", 2208, 4);

  private MDC_DIM_MIN(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_DIM_MIN get() {
    return _instance;
  }
}
