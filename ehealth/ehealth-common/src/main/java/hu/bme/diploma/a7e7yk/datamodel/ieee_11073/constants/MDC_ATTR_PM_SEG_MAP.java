
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_ATTR_PM_SEG_MAP extends MdcNomenclatureValue {

  private static final MDC_ATTR_PM_SEG_MAP _instance = new MDC_ATTR_PM_SEG_MAP("MDC_ATTR_PM_SEG_MAP", 2638, 1);

  private MDC_ATTR_PM_SEG_MAP(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_ATTR_PM_SEG_MAP get() {
    return _instance;
  }
}
