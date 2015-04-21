
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_BACK_TRAPEZ extends MdcNomenclatureValue {

  private static final MDC_MUSC_BACK_TRAPEZ _instance = new MDC_MUSC_BACK_TRAPEZ("MDC_MUSC_BACK_TRAPEZ", 436, 7);

  private MDC_MUSC_BACK_TRAPEZ(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_BACK_TRAPEZ get() {
    return _instance;
  }
}
