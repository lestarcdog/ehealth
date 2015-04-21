
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_UPEXT_SUBSCAP extends MdcNomenclatureValue {

  private static final MDC_MUSC_UPEXT_SUBSCAP _instance = new MDC_MUSC_UPEXT_SUBSCAP("MDC_MUSC_UPEXT_SUBSCAP", 624, 7);

  private MDC_MUSC_UPEXT_SUBSCAP(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_UPEXT_SUBSCAP get() {
    return _instance;
  }
}
