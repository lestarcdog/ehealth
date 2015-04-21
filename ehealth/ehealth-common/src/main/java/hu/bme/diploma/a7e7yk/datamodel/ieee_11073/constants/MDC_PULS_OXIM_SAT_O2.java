
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_PULS_OXIM_SAT_O2 extends MdcNomenclatureValue {

  private static final MDC_PULS_OXIM_SAT_O2 _instance = new MDC_PULS_OXIM_SAT_O2("MDC_PULS_OXIM_SAT_O2", 19384, 2);

  private MDC_PULS_OXIM_SAT_O2(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_PULS_OXIM_SAT_O2 get() {
    return _instance;
  }
}
