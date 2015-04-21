
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_ATTR_PM_SEG_LABEL_STRING extends MdcNomenclatureValue {

  private static final MDC_ATTR_PM_SEG_LABEL_STRING _instance = new MDC_ATTR_PM_SEG_LABEL_STRING("MDC_ATTR_PM_SEG_LABEL_STRING", 2648, 1);

  private MDC_ATTR_PM_SEG_LABEL_STRING(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_ATTR_PM_SEG_LABEL_STRING get() {
    return _instance;
  }
}
