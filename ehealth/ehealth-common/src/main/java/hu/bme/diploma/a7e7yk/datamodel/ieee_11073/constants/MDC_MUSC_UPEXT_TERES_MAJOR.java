
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_UPEXT_TERES_MAJOR extends MdcNomenclatureValue {

  private static final MDC_MUSC_UPEXT_TERES_MAJOR _instance = new MDC_MUSC_UPEXT_TERES_MAJOR("MDC_MUSC_UPEXT_TERES_MAJOR", 620, 7);

  private MDC_MUSC_UPEXT_TERES_MAJOR(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_UPEXT_TERES_MAJOR get() {
    return _instance;
  }
}
