
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_BACK_INTERSPINAL extends MdcNomenclatureValue {

  private static final MDC_MUSC_BACK_INTERSPINAL _instance = new MDC_MUSC_BACK_INTERSPINAL("MDC_MUSC_BACK_INTERSPINAL", 512, 7);

  private MDC_MUSC_BACK_INTERSPINAL(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_BACK_INTERSPINAL get() {
    return _instance;
  }
}
