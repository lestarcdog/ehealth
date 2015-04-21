
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_AI_LOCATION_BEDROOMMASTER extends MdcNomenclatureValue {

  private static final MDC_AI_LOCATION_BEDROOMMASTER _instance = new MDC_AI_LOCATION_BEDROOMMASTER("MDC_AI_LOCATION_BEDROOMMASTER", 3136, 130);

  private MDC_AI_LOCATION_BEDROOMMASTER(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_AI_LOCATION_BEDROOMMASTER get() {
    return _instance;
  }
}
