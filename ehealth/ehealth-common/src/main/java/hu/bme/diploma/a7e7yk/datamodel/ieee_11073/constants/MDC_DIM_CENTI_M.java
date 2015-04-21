
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_DIM_CENTI_M extends MdcNomenclatureValue {

  private static final MDC_DIM_CENTI_M _instance = new MDC_DIM_CENTI_M("MDC_DIM_CENTI_M", 1297, 4);

  private MDC_DIM_CENTI_M(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_DIM_CENTI_M get() {
    return _instance;
  }
}
