
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_NOTI_UNBUF_SCAN_REPORT_MP_VAR extends MdcNomenclatureValue {

  private static final MDC_NOTI_UNBUF_SCAN_REPORT_MP_VAR _instance = new MDC_NOTI_UNBUF_SCAN_REPORT_MP_VAR("MDC_NOTI_UNBUF_SCAN_REPORT_MP_VAR", 3365, 1);

  private MDC_NOTI_UNBUF_SCAN_REPORT_MP_VAR(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_NOTI_UNBUF_SCAN_REPORT_MP_VAR get() {
    return _instance;
  }
}
