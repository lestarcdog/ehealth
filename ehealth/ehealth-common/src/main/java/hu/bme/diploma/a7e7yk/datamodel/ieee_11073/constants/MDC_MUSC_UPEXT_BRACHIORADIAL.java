
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_UPEXT_BRACHIORADIAL extends MdcNomenclatureValue {

  private static final MDC_MUSC_UPEXT_BRACHIORADIAL _instance = new MDC_MUSC_UPEXT_BRACHIORADIAL("MDC_MUSC_UPEXT_BRACHIORADIAL", 692, 7);

  private MDC_MUSC_UPEXT_BRACHIORADIAL(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_UPEXT_BRACHIORADIAL get() {
    return _instance;
  }
}
