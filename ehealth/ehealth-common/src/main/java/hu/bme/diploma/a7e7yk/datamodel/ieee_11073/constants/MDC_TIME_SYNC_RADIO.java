
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_TIME_SYNC_RADIO extends MdcNomenclatureValue {

  private static final MDC_TIME_SYNC_RADIO _instance = new MDC_TIME_SYNC_RADIO("MDC_TIME_SYNC_RADIO", 7942, 8);

  private MDC_TIME_SYNC_RADIO(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_TIME_SYNC_RADIO get() {
    return _instance;
  }
}
