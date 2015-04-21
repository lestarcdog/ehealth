
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_AI_LOCATION_WARDROBEDOOR extends MdcNomenclatureValue {

  private static final MDC_AI_LOCATION_WARDROBEDOOR _instance = new MDC_AI_LOCATION_WARDROBEDOOR("MDC_AI_LOCATION_WARDROBEDOOR", 9472, 130);

  private MDC_AI_LOCATION_WARDROBEDOOR(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_AI_LOCATION_WARDROBEDOOR get() {
    return _instance;
  }
}
