
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_AI_TYPE_SENSOR_CONTACTCLOSURE extends MdcNomenclatureValue {

  private static final MDC_AI_TYPE_SENSOR_CONTACTCLOSURE _instance = new MDC_AI_TYPE_SENSOR_CONTACTCLOSURE("MDC_AI_TYPE_SENSOR_CONTACTCLOSURE", 10, 130);

  private MDC_AI_TYPE_SENSOR_CONTACTCLOSURE(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_AI_TYPE_SENSOR_CONTACTCLOSURE get() {
    return _instance;
  }
}
