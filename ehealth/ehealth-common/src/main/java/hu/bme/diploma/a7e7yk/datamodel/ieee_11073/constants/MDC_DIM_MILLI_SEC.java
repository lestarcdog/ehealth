
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_DIM_MILLI_SEC extends MdcNomenclatureValue {

  private static final MDC_DIM_MILLI_SEC _instance = new MDC_DIM_MILLI_SEC("MDC_DIM_MILLI_SEC", 2194, 4);

  private MDC_DIM_MILLI_SEC(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_DIM_MILLI_SEC get() {
    return _instance;
  }
}
