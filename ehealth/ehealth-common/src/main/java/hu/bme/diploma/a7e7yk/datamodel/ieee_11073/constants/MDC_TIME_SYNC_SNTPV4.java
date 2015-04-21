
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_TIME_SYNC_SNTPV4 extends MdcNomenclatureValue {

  private static final MDC_TIME_SYNC_SNTPV4 _instance = new MDC_TIME_SYNC_SNTPV4("MDC_TIME_SYNC_SNTPV4", 7939, 8);

  private MDC_TIME_SYNC_SNTPV4(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_TIME_SYNC_SNTPV4 get() {
    return _instance;
  }
}
