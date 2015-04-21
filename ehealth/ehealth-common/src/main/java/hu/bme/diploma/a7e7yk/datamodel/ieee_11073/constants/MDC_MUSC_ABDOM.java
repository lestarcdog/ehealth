
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_ABDOM extends MdcNomenclatureValue {

  private static final MDC_MUSC_ABDOM _instance = new MDC_MUSC_ABDOM("MDC_MUSC_ABDOM", 556, 7);

  private MDC_MUSC_ABDOM(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_ABDOM get() {
    return _instance;
  }
}
