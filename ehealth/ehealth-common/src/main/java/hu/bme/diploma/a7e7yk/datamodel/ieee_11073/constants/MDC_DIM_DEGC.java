
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_DIM_DEGC extends MdcNomenclatureValue {

  private static final MDC_DIM_DEGC _instance = new MDC_DIM_DEGC("MDC_DIM_DEGC", 6048, 4);

  private MDC_DIM_DEGC(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_DIM_DEGC get() {
    return _instance;
  }
}
