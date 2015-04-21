
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_AI_LOCATION_FRONTGARDEN extends MdcNomenclatureValue {

  private static final MDC_AI_LOCATION_FRONTGARDEN _instance = new MDC_AI_LOCATION_FRONTGARDEN("MDC_AI_LOCATION_FRONTGARDEN", 4288, 130);

  private MDC_AI_LOCATION_FRONTGARDEN(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_AI_LOCATION_FRONTGARDEN get() {
    return _instance;
  }
}
