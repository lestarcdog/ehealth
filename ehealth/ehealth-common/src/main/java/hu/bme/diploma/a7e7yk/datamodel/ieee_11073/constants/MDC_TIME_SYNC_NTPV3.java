
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_TIME_SYNC_NTPV3 extends MdcNomenclatureValue {

  private static final MDC_TIME_SYNC_NTPV3 _instance = new MDC_TIME_SYNC_NTPV3("MDC_TIME_SYNC_NTPV3", 7937, 8);

  private MDC_TIME_SYNC_NTPV3(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_TIME_SYNC_NTPV3 get() {
    return _instance;
  }
}
