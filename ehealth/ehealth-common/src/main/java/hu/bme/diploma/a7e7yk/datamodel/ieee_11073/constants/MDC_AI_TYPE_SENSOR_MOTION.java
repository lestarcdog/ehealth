
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_AI_TYPE_SENSOR_MOTION extends MdcNomenclatureValue {

  private static final MDC_AI_TYPE_SENSOR_MOTION _instance = new MDC_AI_TYPE_SENSOR_MOTION("MDC_AI_TYPE_SENSOR_MOTION", 7, 130);

  private MDC_AI_TYPE_SENSOR_MOTION(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_AI_TYPE_SENSOR_MOTION get() {
    return _instance;
  }
}
