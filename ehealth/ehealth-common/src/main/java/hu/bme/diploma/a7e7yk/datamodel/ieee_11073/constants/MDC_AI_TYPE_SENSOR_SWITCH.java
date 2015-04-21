
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_AI_TYPE_SENSOR_SWITCH extends MdcNomenclatureValue {

  private static final MDC_AI_TYPE_SENSOR_SWITCH _instance = new MDC_AI_TYPE_SENSOR_SWITCH("MDC_AI_TYPE_SENSOR_SWITCH", 12, 130);

  private MDC_AI_TYPE_SENSOR_SWITCH(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_AI_TYPE_SENSOR_SWITCH get() {
    return _instance;
  }
}
