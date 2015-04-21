
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_TIME_SYNC_HL7_NCK extends MdcNomenclatureValue {

  private static final MDC_TIME_SYNC_HL7_NCK _instance = new MDC_TIME_SYNC_HL7_NCK("MDC_TIME_SYNC_HL7_NCK", 7943, 8);

  private MDC_TIME_SYNC_HL7_NCK(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_TIME_SYNC_HL7_NCK get() {
    return _instance;
  }
}
