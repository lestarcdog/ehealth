
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_ATTR_PM_SEG_PERSON_ID extends MdcNomenclatureValue {

  private static final MDC_ATTR_PM_SEG_PERSON_ID _instance = new MDC_ATTR_PM_SEG_PERSON_ID("MDC_ATTR_PM_SEG_PERSON_ID", 2639, 1);

  private MDC_ATTR_PM_SEG_PERSON_ID(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_ATTR_PM_SEG_PERSON_ID get() {
    return _instance;
  }
}
