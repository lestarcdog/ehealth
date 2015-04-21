
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_PRESS_BLD_NONINV_MEAN extends MdcNomenclatureValue {

  private static final MDC_PRESS_BLD_NONINV_MEAN _instance = new MDC_PRESS_BLD_NONINV_MEAN("MDC_PRESS_BLD_NONINV_MEAN", 18951, 2);

  private MDC_PRESS_BLD_NONINV_MEAN(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_PRESS_BLD_NONINV_MEAN get() {
    return _instance;
  }
}
