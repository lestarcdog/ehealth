
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_UPEXT_ANCON extends MdcNomenclatureValue {

  private static final MDC_MUSC_UPEXT_ANCON _instance = new MDC_MUSC_UPEXT_ANCON("MDC_MUSC_UPEXT_ANCON", 656, 7);

  private MDC_MUSC_UPEXT_ANCON(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_UPEXT_ANCON get() {
    return _instance;
  }
}
