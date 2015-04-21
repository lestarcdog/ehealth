
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MOC_SCAN_CFG_PERI extends MdcNomenclatureValue {

  private static final MDC_MOC_SCAN_CFG_PERI _instance = new MDC_MOC_SCAN_CFG_PERI("MDC_MOC_SCAN_CFG_PERI", 19, 1);

  private MDC_MOC_SCAN_CFG_PERI(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MOC_SCAN_CFG_PERI get() {
    return _instance;
  }
}
