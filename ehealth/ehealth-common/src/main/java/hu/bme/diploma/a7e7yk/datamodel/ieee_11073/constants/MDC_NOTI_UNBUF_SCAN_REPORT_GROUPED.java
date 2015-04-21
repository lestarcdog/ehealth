
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_NOTI_UNBUF_SCAN_REPORT_GROUPED extends MdcNomenclatureValue {

  private static final MDC_NOTI_UNBUF_SCAN_REPORT_GROUPED _instance = new MDC_NOTI_UNBUF_SCAN_REPORT_GROUPED("MDC_NOTI_UNBUF_SCAN_REPORT_GROUPED", 3364, 1);

  private MDC_NOTI_UNBUF_SCAN_REPORT_GROUPED(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_NOTI_UNBUF_SCAN_REPORT_GROUPED get() {
    return _instance;
  }
}
