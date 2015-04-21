
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_ATTR_TIME_START_SEG_BO extends MdcNomenclatureValue {

  private static final MDC_ATTR_TIME_START_SEG_BO _instance = new MDC_ATTR_TIME_START_SEG_BO("MDC_ATTR_TIME_START_SEG_BO", 2691, 1);

  private MDC_ATTR_TIME_START_SEG_BO(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_ATTR_TIME_START_SEG_BO get() {
    return _instance;
  }
}
