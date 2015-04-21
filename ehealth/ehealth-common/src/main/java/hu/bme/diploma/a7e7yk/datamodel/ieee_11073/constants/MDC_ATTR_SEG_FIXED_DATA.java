
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_ATTR_SEG_FIXED_DATA extends MdcNomenclatureValue {

  private static final MDC_ATTR_SEG_FIXED_DATA _instance = new MDC_ATTR_SEG_FIXED_DATA("MDC_ATTR_SEG_FIXED_DATA", 2641, 1);

  private MDC_ATTR_SEG_FIXED_DATA(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_ATTR_SEG_FIXED_DATA get() {
    return _instance;
  }
}
