
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_DIM_RESP_PER_MIN extends MdcNomenclatureValue {

  private static final MDC_DIM_RESP_PER_MIN _instance = new MDC_DIM_RESP_PER_MIN("MDC_DIM_RESP_PER_MIN", 2784, 4);

  private MDC_DIM_RESP_PER_MIN(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_DIM_RESP_PER_MIN get() {
    return _instance;
  }
}
