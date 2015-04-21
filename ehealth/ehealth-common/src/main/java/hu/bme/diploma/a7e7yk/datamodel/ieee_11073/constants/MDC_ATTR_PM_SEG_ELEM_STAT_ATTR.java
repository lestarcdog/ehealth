
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_ATTR_PM_SEG_ELEM_STAT_ATTR extends MdcNomenclatureValue {

  private static final MDC_ATTR_PM_SEG_ELEM_STAT_ATTR _instance = new MDC_ATTR_PM_SEG_ELEM_STAT_ATTR("MDC_ATTR_PM_SEG_ELEM_STAT_ATTR", 2642, 1);

  private MDC_ATTR_PM_SEG_ELEM_STAT_ATTR(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_ATTR_PM_SEG_ELEM_STAT_ATTR get() {
    return _instance;
  }
}
