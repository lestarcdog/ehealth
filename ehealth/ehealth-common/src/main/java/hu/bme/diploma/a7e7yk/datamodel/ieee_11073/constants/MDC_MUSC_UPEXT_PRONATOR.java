
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_UPEXT_PRONATOR extends MdcNomenclatureValue {

  private static final MDC_MUSC_UPEXT_PRONATOR _instance = new MDC_MUSC_UPEXT_PRONATOR("MDC_MUSC_UPEXT_PRONATOR", 660, 7);

  private MDC_MUSC_UPEXT_PRONATOR(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_UPEXT_PRONATOR get() {
    return _instance;
  }
}
