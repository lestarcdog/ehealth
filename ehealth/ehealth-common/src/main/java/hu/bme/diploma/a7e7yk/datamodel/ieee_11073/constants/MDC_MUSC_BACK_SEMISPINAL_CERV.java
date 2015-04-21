
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_BACK_SEMISPINAL_CERV extends MdcNomenclatureValue {

  private static final MDC_MUSC_BACK_SEMISPINAL_CERV _instance = new MDC_MUSC_BACK_SEMISPINAL_CERV("MDC_MUSC_BACK_SEMISPINAL_CERV", 500, 7);

  private MDC_MUSC_BACK_SEMISPINAL_CERV(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_BACK_SEMISPINAL_CERV get() {
    return _instance;
  }
}
