
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_PRESS_BLD_NONINV_DIA extends MdcNomenclatureValue {

  private static final MDC_PRESS_BLD_NONINV_DIA _instance = new MDC_PRESS_BLD_NONINV_DIA("MDC_PRESS_BLD_NONINV_DIA", 18950, 2);

  private MDC_PRESS_BLD_NONINV_DIA(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_PRESS_BLD_NONINV_DIA get() {
    return _instance;
  }
}
