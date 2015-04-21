
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MASS_BODY_ACTUAL extends MdcNomenclatureValue {

  private static final MDC_MASS_BODY_ACTUAL _instance = new MDC_MASS_BODY_ACTUAL("MDC_MASS_BODY_ACTUAL", 57664, 2);

  private MDC_MASS_BODY_ACTUAL(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MASS_BODY_ACTUAL get() {
    return _instance;
  }
}
