
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_PULS_RATE_NON_INV extends MdcNomenclatureValue {

  private static final MDC_PULS_RATE_NON_INV _instance = new MDC_PULS_RATE_NON_INV("MDC_PULS_RATE_NON_INV", 18474, 2);

  private MDC_PULS_RATE_NON_INV(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_PULS_RATE_NON_INV get() {
    return _instance;
  }
}
