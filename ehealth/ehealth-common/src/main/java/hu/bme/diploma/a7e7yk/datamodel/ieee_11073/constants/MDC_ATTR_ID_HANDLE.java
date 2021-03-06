
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_ATTR_ID_HANDLE extends MdcNomenclatureValue {

  private static final MDC_ATTR_ID_HANDLE _instance = new MDC_ATTR_ID_HANDLE("MDC_ATTR_ID_HANDLE", 2337, 1);

  private MDC_ATTR_ID_HANDLE(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_ATTR_ID_HANDLE get() {
    return _instance;
  }
}
