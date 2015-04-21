
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_NOTI_SCAN_REPORT_FIXED extends MdcNomenclatureValue {

  private static final MDC_NOTI_SCAN_REPORT_FIXED _instance = new MDC_NOTI_SCAN_REPORT_FIXED("MDC_NOTI_SCAN_REPORT_FIXED", 3357, 1);

  private MDC_NOTI_SCAN_REPORT_FIXED(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_NOTI_SCAN_REPORT_FIXED get() {
    return _instance;
  }
}
