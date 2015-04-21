
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_NOTI_SCAN_REPORT_MP_FIXED extends MdcNomenclatureValue {

  private static final MDC_NOTI_SCAN_REPORT_MP_FIXED _instance = new MDC_NOTI_SCAN_REPORT_MP_FIXED("MDC_NOTI_SCAN_REPORT_MP_FIXED", 3359, 1);

  private MDC_NOTI_SCAN_REPORT_MP_FIXED(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_NOTI_SCAN_REPORT_MP_FIXED get() {
    return _instance;
  }
}
