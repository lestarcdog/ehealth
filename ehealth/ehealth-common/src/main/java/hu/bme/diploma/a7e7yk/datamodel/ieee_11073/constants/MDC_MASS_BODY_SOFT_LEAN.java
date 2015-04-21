
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MASS_BODY_SOFT_LEAN extends MdcNomenclatureValue {

  private static final MDC_MASS_BODY_SOFT_LEAN _instance = new MDC_MASS_BODY_SOFT_LEAN("MDC_MASS_BODY_SOFT_LEAN", 57688, 2);

  private MDC_MASS_BODY_SOFT_LEAN(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MASS_BODY_SOFT_LEAN get() {
    return _instance;
  }
}
