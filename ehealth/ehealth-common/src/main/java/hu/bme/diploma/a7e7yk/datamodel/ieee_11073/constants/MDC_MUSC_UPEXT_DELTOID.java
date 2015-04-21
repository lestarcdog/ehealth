
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_UPEXT_DELTOID extends MdcNomenclatureValue {

  private static final MDC_MUSC_UPEXT_DELTOID _instance = new MDC_MUSC_UPEXT_DELTOID("MDC_MUSC_UPEXT_DELTOID", 604, 7);

  private MDC_MUSC_UPEXT_DELTOID(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_UPEXT_DELTOID get() {
    return _instance;
  }
}
