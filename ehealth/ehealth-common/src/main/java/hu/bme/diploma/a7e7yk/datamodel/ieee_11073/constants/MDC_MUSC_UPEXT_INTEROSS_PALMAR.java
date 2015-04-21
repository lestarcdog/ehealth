
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_UPEXT_INTEROSS_PALMAR extends MdcNomenclatureValue {

  private static final MDC_MUSC_UPEXT_INTEROSS_PALMAR _instance = new MDC_MUSC_UPEXT_INTEROSS_PALMAR("MDC_MUSC_UPEXT_INTEROSS_PALMAR", 776, 7);

  private MDC_MUSC_UPEXT_INTEROSS_PALMAR(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_UPEXT_INTEROSS_PALMAR get() {
    return _instance;
  }
}
