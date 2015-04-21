
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_AI_LOCATION_CHAIR extends MdcNomenclatureValue {

  private static final MDC_AI_LOCATION_CHAIR _instance = new MDC_AI_LOCATION_CHAIR("MDC_AI_LOCATION_CHAIR", 11328, 130);

  private MDC_AI_LOCATION_CHAIR(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_AI_LOCATION_CHAIR get() {
    return _instance;
  }
}
