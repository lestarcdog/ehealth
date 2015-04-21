
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_AI_LOCATION_OTHERDOOR extends MdcNomenclatureValue {

  private static final MDC_AI_LOCATION_OTHERDOOR _instance = new MDC_AI_LOCATION_OTHERDOOR("MDC_AI_LOCATION_OTHERDOOR", 9600, 130);

  private MDC_AI_LOCATION_OTHERDOOR(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_AI_LOCATION_OTHERDOOR get() {
    return _instance;
  }
}
