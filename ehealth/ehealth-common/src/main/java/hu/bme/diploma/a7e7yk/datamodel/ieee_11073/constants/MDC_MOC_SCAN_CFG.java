
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MOC_SCAN_CFG extends MdcNomenclatureValue {

  private static final MDC_MOC_SCAN_CFG _instance = new MDC_MOC_SCAN_CFG("MDC_MOC_SCAN_CFG", 17, 1);

  private MDC_MOC_SCAN_CFG(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MOC_SCAN_CFG get() {
    return _instance;
  }
}
