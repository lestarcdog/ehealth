
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_ATTR_ID_MODEL extends MdcNomenclatureValue {

  private static final MDC_ATTR_ID_MODEL _instance = new MDC_ATTR_ID_MODEL("MDC_ATTR_ID_MODEL", 2344, 1);

  private MDC_ATTR_ID_MODEL(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_ATTR_ID_MODEL get() {
    return _instance;
  }
}
