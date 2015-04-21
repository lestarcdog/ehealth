
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_ABDOM_COCCYG extends MdcNomenclatureValue {

  private static final MDC_MUSC_ABDOM_COCCYG _instance = new MDC_MUSC_ABDOM_COCCYG("MDC_MUSC_ABDOM_COCCYG", 588, 7);

  private MDC_MUSC_ABDOM_COCCYG(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_ABDOM_COCCYG get() {
    return _instance;
  }
}
