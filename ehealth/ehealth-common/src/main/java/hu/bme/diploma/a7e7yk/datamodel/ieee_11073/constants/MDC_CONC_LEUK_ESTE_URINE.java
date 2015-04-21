
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_CONC_LEUK_ESTE_URINE extends MdcNomenclatureValue {

  private static final MDC_CONC_LEUK_ESTE_URINE _instance = new MDC_CONC_LEUK_ESTE_URINE("MDC_CONC_LEUK_ESTE_URINE", 29160, 2);

  private MDC_CONC_LEUK_ESTE_URINE(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_CONC_LEUK_ESTE_URINE get() {
    return _instance;
  }
}
