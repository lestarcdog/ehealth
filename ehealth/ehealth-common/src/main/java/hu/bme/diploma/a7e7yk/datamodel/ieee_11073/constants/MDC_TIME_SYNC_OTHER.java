
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_TIME_SYNC_OTHER extends MdcNomenclatureValue {

  private static final MDC_TIME_SYNC_OTHER _instance = new MDC_TIME_SYNC_OTHER("MDC_TIME_SYNC_OTHER", 7948, 8);

  private MDC_TIME_SYNC_OTHER(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_TIME_SYNC_OTHER get() {
    return _instance;
  }
}
