
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_UPEXT_INTEROSS_DORSAL extends MdcNomenclatureValue {

  private static final MDC_MUSC_UPEXT_INTEROSS_DORSAL _instance = new MDC_MUSC_UPEXT_INTEROSS_DORSAL("MDC_MUSC_UPEXT_INTEROSS_DORSAL", 772, 7);

  private MDC_MUSC_UPEXT_INTEROSS_DORSAL(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_UPEXT_INTEROSS_DORSAL get() {
    return _instance;
  }
}
