
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_AI_LOCATION_HALL extends MdcNomenclatureValue {

  private static final MDC_AI_LOCATION_HALL _instance = new MDC_AI_LOCATION_HALL("MDC_AI_LOCATION_HALL", 3840, 130);

  private MDC_AI_LOCATION_HALL(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_AI_LOCATION_HALL get() {
    return _instance;
  }
}
