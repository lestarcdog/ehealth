
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_HEAD extends MdcNomenclatureValue {

  private static final MDC_MUSC_HEAD _instance = new MDC_MUSC_HEAD("MDC_MUSC_HEAD", 252, 7);

  private MDC_MUSC_HEAD(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_HEAD get() {
    return _instance;
  }
}
