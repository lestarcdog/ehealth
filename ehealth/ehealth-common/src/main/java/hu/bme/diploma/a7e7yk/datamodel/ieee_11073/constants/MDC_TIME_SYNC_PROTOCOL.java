
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_TIME_SYNC_PROTOCOL extends MdcNomenclatureValue {

  private static final MDC_TIME_SYNC_PROTOCOL _instance = new MDC_TIME_SYNC_PROTOCOL("MDC_TIME_SYNC_PROTOCOL", 2684, 1);

  private MDC_TIME_SYNC_PROTOCOL(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_TIME_SYNC_PROTOCOL get() {
    return _instance;
  }
}
