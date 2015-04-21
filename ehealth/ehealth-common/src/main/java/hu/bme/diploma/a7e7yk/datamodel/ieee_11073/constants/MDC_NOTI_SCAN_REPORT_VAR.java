
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_NOTI_SCAN_REPORT_VAR extends MdcNomenclatureValue {

  private static final MDC_NOTI_SCAN_REPORT_VAR _instance = new MDC_NOTI_SCAN_REPORT_VAR("MDC_NOTI_SCAN_REPORT_VAR", 3358, 1);

  private MDC_NOTI_SCAN_REPORT_VAR(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_NOTI_SCAN_REPORT_VAR get() {
    return _instance;
  }
}
