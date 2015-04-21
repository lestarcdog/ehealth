
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_AI_TYPE_SENSOR_TEMP extends MdcNomenclatureValue {

  private static final MDC_AI_TYPE_SENSOR_TEMP _instance = new MDC_AI_TYPE_SENSOR_TEMP("MDC_AI_TYPE_SENSOR_TEMP", 14, 130);

  private MDC_AI_TYPE_SENSOR_TEMP(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_AI_TYPE_SENSOR_TEMP get() {
    return _instance;
  }
}
