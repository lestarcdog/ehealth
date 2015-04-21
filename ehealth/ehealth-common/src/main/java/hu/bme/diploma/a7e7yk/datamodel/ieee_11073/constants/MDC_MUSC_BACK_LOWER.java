
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_BACK_LOWER extends MdcNomenclatureValue {

  private static final MDC_MUSC_BACK_LOWER _instance = new MDC_MUSC_BACK_LOWER("MDC_MUSC_BACK_LOWER", 432, 7);

  private MDC_MUSC_BACK_LOWER(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_BACK_LOWER get() {
    return _instance;
  }
}
