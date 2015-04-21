
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_UPEXT_LUMBRICAL extends MdcNomenclatureValue {

  private static final MDC_MUSC_UPEXT_LUMBRICAL _instance = new MDC_MUSC_UPEXT_LUMBRICAL("MDC_MUSC_UPEXT_LUMBRICAL", 768, 7);

  private MDC_MUSC_UPEXT_LUMBRICAL(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_UPEXT_LUMBRICAL get() {
    return _instance;
  }
}
