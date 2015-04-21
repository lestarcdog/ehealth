
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_ABDOM_PELV extends MdcNomenclatureValue {

  private static final MDC_MUSC_ABDOM_PELV _instance = new MDC_MUSC_ABDOM_PELV("MDC_MUSC_ABDOM_PELV", 580, 7);

  private MDC_MUSC_ABDOM_PELV(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_ABDOM_PELV get() {
    return _instance;
  }
}
