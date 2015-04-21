
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_PRESS_BLD_NONINV extends MdcNomenclatureValue {

  private static final MDC_PRESS_BLD_NONINV _instance = new MDC_PRESS_BLD_NONINV("MDC_PRESS_BLD_NONINV", 18948, 2);

  private MDC_PRESS_BLD_NONINV(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_PRESS_BLD_NONINV get() {
    return _instance;
  }
}
