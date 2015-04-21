
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_ATTR_TIME_PD_SAMP extends MdcNomenclatureValue {

  private static final MDC_ATTR_TIME_PD_SAMP _instance = new MDC_ATTR_TIME_PD_SAMP("MDC_ATTR_TIME_PD_SAMP", 2445, 1);

  private MDC_ATTR_TIME_PD_SAMP(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_ATTR_TIME_PD_SAMP get() {
    return _instance;
  }
}
