
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_UPEXT extends MdcNomenclatureValue {

  private static final MDC_MUSC_UPEXT _instance = new MDC_MUSC_UPEXT("MDC_MUSC_UPEXT", 600, 7);

  private MDC_MUSC_UPEXT(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_UPEXT get() {
    return _instance;
  }
}
