
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_ABDOM_ABDOM_TRANSVERS extends MdcNomenclatureValue {

  private static final MDC_MUSC_ABDOM_ABDOM_TRANSVERS _instance = new MDC_MUSC_ABDOM_ABDOM_TRANSVERS("MDC_MUSC_ABDOM_ABDOM_TRANSVERS", 572, 7);

  private MDC_MUSC_ABDOM_ABDOM_TRANSVERS(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_ABDOM_ABDOM_TRANSVERS get() {
    return _instance;
  }
}
