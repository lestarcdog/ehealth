
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_ATTR_SCAN_REP_PD extends MdcNomenclatureValue {

  private static final MDC_ATTR_SCAN_REP_PD _instance = new MDC_ATTR_SCAN_REP_PD("MDC_ATTR_SCAN_REP_PD", 2421, 1);

  private MDC_ATTR_SCAN_REP_PD(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_ATTR_SCAN_REP_PD get() {
    return _instance;
  }
}
