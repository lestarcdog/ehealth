
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_AI_TYPE_SENSOR_FALL extends MdcNomenclatureValue {

  private static final MDC_AI_TYPE_SENSOR_FALL _instance = new MDC_AI_TYPE_SENSOR_FALL("MDC_AI_TYPE_SENSOR_FALL", 1, 130);

  private MDC_AI_TYPE_SENSOR_FALL(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_AI_TYPE_SENSOR_FALL get() {
    return _instance;
  }
}
