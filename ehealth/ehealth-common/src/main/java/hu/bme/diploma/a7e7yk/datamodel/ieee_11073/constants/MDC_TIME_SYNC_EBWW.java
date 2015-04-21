
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_TIME_SYNC_EBWW extends MdcNomenclatureValue {

  private static final MDC_TIME_SYNC_EBWW _instance = new MDC_TIME_SYNC_EBWW("MDC_TIME_SYNC_EBWW", 7946, 8);

  private MDC_TIME_SYNC_EBWW(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_TIME_SYNC_EBWW get() {
    return _instance;
  }
}
