
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_ATTR_SEG_STATS extends MdcNomenclatureValue {

  private static final MDC_ATTR_SEG_STATS _instance = new MDC_ATTR_SEG_STATS("MDC_ATTR_SEG_STATS", 2640, 1);

  private MDC_ATTR_SEG_STATS(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_ATTR_SEG_STATS get() {
    return _instance;
  }
}
