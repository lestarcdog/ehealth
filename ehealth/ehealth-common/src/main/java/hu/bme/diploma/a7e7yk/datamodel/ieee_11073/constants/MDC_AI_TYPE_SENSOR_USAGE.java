
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_AI_TYPE_SENSOR_USAGE extends MdcNomenclatureValue {

  private static final MDC_AI_TYPE_SENSOR_USAGE _instance = new MDC_AI_TYPE_SENSOR_USAGE("MDC_AI_TYPE_SENSOR_USAGE", 11, 130);

  private MDC_AI_TYPE_SENSOR_USAGE(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_AI_TYPE_SENSOR_USAGE get() {
    return _instance;
  }
}
