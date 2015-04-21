
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_AI_TYPE_SENSOR_PROPEXIT extends MdcNomenclatureValue {

  private static final MDC_AI_TYPE_SENSOR_PROPEXIT _instance = new MDC_AI_TYPE_SENSOR_PROPEXIT("MDC_AI_TYPE_SENSOR_PROPEXIT", 8, 130);

  private MDC_AI_TYPE_SENSOR_PROPEXIT(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_AI_TYPE_SENSOR_PROPEXIT get() {
    return _instance;
  }
}
