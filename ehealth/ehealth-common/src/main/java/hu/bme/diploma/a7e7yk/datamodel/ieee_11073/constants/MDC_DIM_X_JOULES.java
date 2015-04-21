
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_DIM_X_JOULES extends MdcNomenclatureValue {

  private static final MDC_DIM_X_JOULES _instance = new MDC_DIM_X_JOULES("MDC_DIM_X_JOULES", 3968, 4);

  private MDC_DIM_X_JOULES(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_DIM_X_JOULES get() {
    return _instance;
  }
}
