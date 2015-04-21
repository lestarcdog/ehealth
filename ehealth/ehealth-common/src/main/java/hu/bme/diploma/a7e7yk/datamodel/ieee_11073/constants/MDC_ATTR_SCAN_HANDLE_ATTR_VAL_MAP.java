
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_ATTR_SCAN_HANDLE_ATTR_VAL_MAP extends MdcNomenclatureValue {

  private static final MDC_ATTR_SCAN_HANDLE_ATTR_VAL_MAP _instance = new MDC_ATTR_SCAN_HANDLE_ATTR_VAL_MAP("MDC_ATTR_SCAN_HANDLE_ATTR_VAL_MAP", 2643, 1);

  private MDC_ATTR_SCAN_HANDLE_ATTR_VAL_MAP(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_ATTR_SCAN_HANDLE_ATTR_VAL_MAP get() {
    return _instance;
  }
}
