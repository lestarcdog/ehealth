
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_NOTI_SEGMENT_DATA extends MdcNomenclatureValue {

  private static final MDC_NOTI_SEGMENT_DATA _instance = new MDC_NOTI_SEGMENT_DATA("MDC_NOTI_SEGMENT_DATA", 3361, 1);

  private MDC_NOTI_SEGMENT_DATA(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_NOTI_SEGMENT_DATA get() {
    return _instance;
  }
}
