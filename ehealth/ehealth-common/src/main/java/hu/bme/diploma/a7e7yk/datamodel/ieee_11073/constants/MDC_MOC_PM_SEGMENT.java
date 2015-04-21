
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MOC_PM_SEGMENT extends MdcNomenclatureValue {

  private static final MDC_MOC_PM_SEGMENT _instance = new MDC_MOC_PM_SEGMENT("MDC_MOC_PM_SEGMENT", 62, 1);

  private MDC_MOC_PM_SEGMENT(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MOC_PM_SEGMENT get() {
    return _instance;
  }
}
