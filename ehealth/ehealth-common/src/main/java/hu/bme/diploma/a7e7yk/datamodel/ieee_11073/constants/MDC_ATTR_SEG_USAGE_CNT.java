
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_ATTR_SEG_USAGE_CNT extends MdcNomenclatureValue {

  private static final MDC_ATTR_SEG_USAGE_CNT _instance = new MDC_ATTR_SEG_USAGE_CNT("MDC_ATTR_SEG_USAGE_CNT", 2427, 1);

  private MDC_ATTR_SEG_USAGE_CNT(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_ATTR_SEG_USAGE_CNT get() {
    return _instance;
  }
}
