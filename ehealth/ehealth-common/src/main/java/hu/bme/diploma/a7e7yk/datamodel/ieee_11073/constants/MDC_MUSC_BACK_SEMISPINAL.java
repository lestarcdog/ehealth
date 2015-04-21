
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_BACK_SEMISPINAL extends MdcNomenclatureValue {

  private static final MDC_MUSC_BACK_SEMISPINAL _instance = new MDC_MUSC_BACK_SEMISPINAL("MDC_MUSC_BACK_SEMISPINAL", 492, 7);

  private MDC_MUSC_BACK_SEMISPINAL(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_BACK_SEMISPINAL get() {
    return _instance;
  }
}
