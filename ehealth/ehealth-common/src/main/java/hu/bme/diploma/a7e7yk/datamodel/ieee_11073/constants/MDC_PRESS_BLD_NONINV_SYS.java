
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_PRESS_BLD_NONINV_SYS extends MdcNomenclatureValue {

  private static final MDC_PRESS_BLD_NONINV_SYS _instance = new MDC_PRESS_BLD_NONINV_SYS("MDC_PRESS_BLD_NONINV_SYS", 18949, 2);

  private MDC_PRESS_BLD_NONINV_SYS(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_PRESS_BLD_NONINV_SYS get() {
    return _instance;
  }
}
