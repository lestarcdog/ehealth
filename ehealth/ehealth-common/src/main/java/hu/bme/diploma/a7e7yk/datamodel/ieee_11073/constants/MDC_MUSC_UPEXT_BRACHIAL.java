
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_UPEXT_BRACHIAL extends MdcNomenclatureValue {

  private static final MDC_MUSC_UPEXT_BRACHIAL _instance = new MDC_MUSC_UPEXT_BRACHIAL("MDC_MUSC_UPEXT_BRACHIAL", 632, 7);

  private MDC_MUSC_UPEXT_BRACHIAL(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_UPEXT_BRACHIAL get() {
    return _instance;
  }
}
