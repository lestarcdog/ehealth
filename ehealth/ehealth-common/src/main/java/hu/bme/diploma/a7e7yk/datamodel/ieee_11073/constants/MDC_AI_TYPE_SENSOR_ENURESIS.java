
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_AI_TYPE_SENSOR_ENURESIS extends MdcNomenclatureValue {

  private static final MDC_AI_TYPE_SENSOR_ENURESIS _instance = new MDC_AI_TYPE_SENSOR_ENURESIS("MDC_AI_TYPE_SENSOR_ENURESIS", 9, 130);

  private MDC_AI_TYPE_SENSOR_ENURESIS(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_AI_TYPE_SENSOR_ENURESIS get() {
    return _instance;
  }
}
