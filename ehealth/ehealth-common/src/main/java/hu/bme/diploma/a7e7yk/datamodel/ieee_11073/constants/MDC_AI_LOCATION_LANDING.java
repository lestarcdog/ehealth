
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_AI_LOCATION_LANDING extends MdcNomenclatureValue {

  private static final MDC_AI_LOCATION_LANDING _instance = new MDC_AI_LOCATION_LANDING("MDC_AI_LOCATION_LANDING", 3904, 130);

  private MDC_AI_LOCATION_LANDING(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_AI_LOCATION_LANDING get() {
    return _instance;
  }
}
