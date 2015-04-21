
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_DIM_FAHR extends MdcNomenclatureValue {

  private static final MDC_DIM_FAHR _instance = new MDC_DIM_FAHR("MDC_DIM_FAHR", 4416, 4);

  private MDC_DIM_FAHR(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_DIM_FAHR get() {
    return _instance;
  }
}
