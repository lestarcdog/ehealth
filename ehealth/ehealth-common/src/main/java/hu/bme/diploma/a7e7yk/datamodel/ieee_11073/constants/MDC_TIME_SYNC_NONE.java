
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_TIME_SYNC_NONE extends MdcNomenclatureValue {

  private static final MDC_TIME_SYNC_NONE _instance = new MDC_TIME_SYNC_NONE("MDC_TIME_SYNC_NONE", 7936, 8);

  private MDC_TIME_SYNC_NONE(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_TIME_SYNC_NONE get() {
    return _instance;
  }
}
