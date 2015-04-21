
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_ABDOM_OBLIQ_EXT extends MdcNomenclatureValue {

  private static final MDC_MUSC_ABDOM_OBLIQ_EXT _instance = new MDC_MUSC_ABDOM_OBLIQ_EXT("MDC_MUSC_ABDOM_OBLIQ_EXT", 564, 7);

  private MDC_MUSC_ABDOM_OBLIQ_EXT(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_ABDOM_OBLIQ_EXT get() {
    return _instance;
  }
}
