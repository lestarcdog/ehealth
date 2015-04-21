
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_ABDOM_OBLIQ_INT extends MdcNomenclatureValue {

  private static final MDC_MUSC_ABDOM_OBLIQ_INT _instance = new MDC_MUSC_ABDOM_OBLIQ_INT("MDC_MUSC_ABDOM_OBLIQ_INT", 568, 7);

  private MDC_MUSC_ABDOM_OBLIQ_INT(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_ABDOM_OBLIQ_INT get() {
    return _instance;
  }
}
