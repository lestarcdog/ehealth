
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_AI_TYPE_SENSOR_GAS extends MdcNomenclatureValue {

  private static final MDC_AI_TYPE_SENSOR_GAS _instance = new MDC_AI_TYPE_SENSOR_GAS("MDC_AI_TYPE_SENSOR_GAS", 6, 130);

  private MDC_AI_TYPE_SENSOR_GAS(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_AI_TYPE_SENSOR_GAS get() {
    return _instance;
  }
}
