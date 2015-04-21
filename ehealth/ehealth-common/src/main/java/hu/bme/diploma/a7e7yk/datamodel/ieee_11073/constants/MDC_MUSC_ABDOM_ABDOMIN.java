
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_ABDOM_ABDOMIN extends MdcNomenclatureValue {

  private static final MDC_MUSC_ABDOM_ABDOMIN _instance = new MDC_MUSC_ABDOM_ABDOMIN("MDC_MUSC_ABDOM_ABDOMIN", 560, 7);

  private MDC_MUSC_ABDOM_ABDOMIN(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_ABDOM_ABDOMIN get() {
    return _instance;
  }
}
