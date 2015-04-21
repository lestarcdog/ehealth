
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_ATTR_SCAN_REP_PD_MIN extends MdcNomenclatureValue {

  private static final MDC_ATTR_SCAN_REP_PD_MIN _instance = new MDC_ATTR_SCAN_REP_PD_MIN("MDC_ATTR_SCAN_REP_PD_MIN", 2644, 1);

  private MDC_ATTR_SCAN_REP_PD_MIN(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_ATTR_SCAN_REP_PD_MIN get() {
    return _instance;
  }
}
