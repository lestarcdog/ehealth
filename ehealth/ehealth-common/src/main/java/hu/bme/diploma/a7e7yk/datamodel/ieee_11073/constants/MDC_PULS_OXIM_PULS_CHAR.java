
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_PULS_OXIM_PULS_CHAR extends MdcNomenclatureValue {

  private static final MDC_PULS_OXIM_PULS_CHAR _instance = new MDC_PULS_OXIM_PULS_CHAR("MDC_PULS_OXIM_PULS_CHAR", 19512, 2);

  private MDC_PULS_OXIM_PULS_CHAR(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_PULS_OXIM_PULS_CHAR get() {
    return _instance;
  }
}
