
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_ATTR_TIME_STAMP_REL_HI_RES extends MdcNomenclatureValue {

  private static final MDC_ATTR_TIME_STAMP_REL_HI_RES _instance = new MDC_ATTR_TIME_STAMP_REL_HI_RES("MDC_ATTR_TIME_STAMP_REL_HI_RES", 2537, 1);

  private MDC_ATTR_TIME_STAMP_REL_HI_RES(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_ATTR_TIME_STAMP_REL_HI_RES get() {
    return _instance;
  }
}
