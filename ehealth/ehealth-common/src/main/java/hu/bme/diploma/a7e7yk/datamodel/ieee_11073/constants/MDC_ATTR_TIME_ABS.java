
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_ATTR_TIME_ABS extends MdcNomenclatureValue {

  private static final MDC_ATTR_TIME_ABS _instance = new MDC_ATTR_TIME_ABS("MDC_ATTR_TIME_ABS", 2439, 1);

  private MDC_ATTR_TIME_ABS(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_ATTR_TIME_ABS get() {
    return _instance;
  }
}
