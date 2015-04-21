
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_AI_LOCATION_BACKGARDEN extends MdcNomenclatureValue {

  private static final MDC_AI_LOCATION_BACKGARDEN _instance = new MDC_AI_LOCATION_BACKGARDEN("MDC_AI_LOCATION_BACKGARDEN", 4352, 130);

  private MDC_AI_LOCATION_BACKGARDEN(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_AI_LOCATION_BACKGARDEN get() {
    return _instance;
  }
}
