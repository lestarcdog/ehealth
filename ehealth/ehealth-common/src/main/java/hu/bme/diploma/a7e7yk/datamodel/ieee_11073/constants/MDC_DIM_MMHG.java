
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_DIM_MMHG extends MdcNomenclatureValue {

  private static final MDC_DIM_MMHG _instance = new MDC_DIM_MMHG("MDC_DIM_MMHG", 3872, 4);

  private MDC_DIM_MMHG(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_DIM_MMHG get() {
    return _instance;
  }
}
