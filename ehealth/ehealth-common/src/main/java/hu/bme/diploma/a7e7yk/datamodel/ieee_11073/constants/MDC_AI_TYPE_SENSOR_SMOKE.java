
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_AI_TYPE_SENSOR_SMOKE extends MdcNomenclatureValue {

  private static final MDC_AI_TYPE_SENSOR_SMOKE _instance = new MDC_AI_TYPE_SENSOR_SMOKE("MDC_AI_TYPE_SENSOR_SMOKE", 3, 130);

  private MDC_AI_TYPE_SENSOR_SMOKE(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_AI_TYPE_SENSOR_SMOKE get() {
    return _instance;
  }
}
