
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_DIM_HR extends MdcNomenclatureValue {

  private static final MDC_DIM_HR _instance = new MDC_DIM_HR("MDC_DIM_HR", 2240, 4);

  private MDC_DIM_HR(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_DIM_HR get() {
    return _instance;
  }
}
