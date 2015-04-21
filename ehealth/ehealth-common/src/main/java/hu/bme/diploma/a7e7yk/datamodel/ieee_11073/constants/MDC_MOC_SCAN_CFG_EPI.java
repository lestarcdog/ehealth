
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MOC_SCAN_CFG_EPI extends MdcNomenclatureValue {

  private static final MDC_MOC_SCAN_CFG_EPI _instance = new MDC_MOC_SCAN_CFG_EPI("MDC_MOC_SCAN_CFG_EPI", 18, 1);

  private MDC_MOC_SCAN_CFG_EPI(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MOC_SCAN_CFG_EPI get() {
    return _instance;
  }
}
