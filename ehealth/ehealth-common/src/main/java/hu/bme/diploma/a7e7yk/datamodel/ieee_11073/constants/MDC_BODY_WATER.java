
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_BODY_WATER extends MdcNomenclatureValue {

  private static final MDC_BODY_WATER _instance = new MDC_BODY_WATER("MDC_BODY_WATER", 57692, 2);

  private MDC_BODY_WATER(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_BODY_WATER get() {
    return _instance;
  }
}
