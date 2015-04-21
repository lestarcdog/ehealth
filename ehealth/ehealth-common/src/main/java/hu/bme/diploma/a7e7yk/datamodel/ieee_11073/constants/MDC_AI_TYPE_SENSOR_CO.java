
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_AI_TYPE_SENSOR_CO extends MdcNomenclatureValue {

  private static final MDC_AI_TYPE_SENSOR_CO _instance = new MDC_AI_TYPE_SENSOR_CO("MDC_AI_TYPE_SENSOR_CO", 4, 130);

  private MDC_AI_TYPE_SENSOR_CO(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_AI_TYPE_SENSOR_CO get() {
    return _instance;
  }
}
