
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_PULS_OXIM_PULS_RATE extends MdcNomenclatureValue {

  private static final MDC_PULS_OXIM_PULS_RATE _instance = new MDC_PULS_OXIM_PULS_RATE("MDC_PULS_OXIM_PULS_RATE", 18458, 2);

  private MDC_PULS_OXIM_PULS_RATE(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_PULS_OXIM_PULS_RATE get() {
    return _instance;
  }
}
