
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_AI_TYPE_SENSOR_PERS extends MdcNomenclatureValue {

  private static final MDC_AI_TYPE_SENSOR_PERS _instance = new MDC_AI_TYPE_SENSOR_PERS("MDC_AI_TYPE_SENSOR_PERS", 2, 130);

  private MDC_AI_TYPE_SENSOR_PERS(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_AI_TYPE_SENSOR_PERS get() {
    return _instance;
  }
}
