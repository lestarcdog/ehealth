
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_AI_TYPE_SENSOR_WATER extends MdcNomenclatureValue {

  private static final MDC_AI_TYPE_SENSOR_WATER _instance = new MDC_AI_TYPE_SENSOR_WATER("MDC_AI_TYPE_SENSOR_WATER", 5, 130);

  private MDC_AI_TYPE_SENSOR_WATER(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_AI_TYPE_SENSOR_WATER get() {
    return _instance;
  }
}
