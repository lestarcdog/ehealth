
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_PULS_OXIM_PLETH extends MdcNomenclatureValue {

  private static final MDC_PULS_OXIM_PLETH _instance = new MDC_PULS_OXIM_PLETH("MDC_PULS_OXIM_PLETH", 19380, 2);

  private MDC_PULS_OXIM_PLETH(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_PULS_OXIM_PLETH get() {
    return _instance;
  }
}
