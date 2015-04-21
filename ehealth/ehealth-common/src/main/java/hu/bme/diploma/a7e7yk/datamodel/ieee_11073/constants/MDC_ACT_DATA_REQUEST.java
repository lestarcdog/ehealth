
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_ACT_DATA_REQUEST extends MdcNomenclatureValue {

  private static final MDC_ACT_DATA_REQUEST _instance = new MDC_ACT_DATA_REQUEST("MDC_ACT_DATA_REQUEST", 3099, 1);

  private MDC_ACT_DATA_REQUEST(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_ACT_DATA_REQUEST get() {
    return _instance;
  }
}
