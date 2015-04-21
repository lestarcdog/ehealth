
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_AI_TYPE_SENSOR_DOSAGE extends MdcNomenclatureValue {

  private static final MDC_AI_TYPE_SENSOR_DOSAGE _instance = new MDC_AI_TYPE_SENSOR_DOSAGE("MDC_AI_TYPE_SENSOR_DOSAGE", 13, 130);

  private MDC_AI_TYPE_SENSOR_DOSAGE(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_AI_TYPE_SENSOR_DOSAGE get() {
    return _instance;
  }
}
