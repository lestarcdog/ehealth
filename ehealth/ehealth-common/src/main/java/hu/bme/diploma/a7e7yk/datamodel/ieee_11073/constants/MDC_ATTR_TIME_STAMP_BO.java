
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_ATTR_TIME_STAMP_BO extends MdcNomenclatureValue {

  private static final MDC_ATTR_TIME_STAMP_BO _instance = new MDC_ATTR_TIME_STAMP_BO("MDC_ATTR_TIME_STAMP_BO", 2690, 1);

  private MDC_ATTR_TIME_STAMP_BO(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_ATTR_TIME_STAMP_BO get() {
    return _instance;
  }
}
