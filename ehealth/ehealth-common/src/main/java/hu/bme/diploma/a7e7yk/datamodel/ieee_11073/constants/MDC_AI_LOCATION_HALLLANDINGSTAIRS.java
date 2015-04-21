
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_AI_LOCATION_HALLLANDINGSTAIRS extends MdcNomenclatureValue {

  private static final MDC_AI_LOCATION_HALLLANDINGSTAIRS _instance = new MDC_AI_LOCATION_HALLLANDINGSTAIRS("MDC_AI_LOCATION_HALLLANDINGSTAIRS", 4032, 130);

  private MDC_AI_LOCATION_HALLLANDINGSTAIRS(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_AI_LOCATION_HALLLANDINGSTAIRS get() {
    return _instance;
  }
}
