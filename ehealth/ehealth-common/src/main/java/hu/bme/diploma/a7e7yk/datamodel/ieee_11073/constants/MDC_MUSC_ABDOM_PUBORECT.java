
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_ABDOM_PUBORECT extends MdcNomenclatureValue {

  private static final MDC_MUSC_ABDOM_PUBORECT _instance = new MDC_MUSC_ABDOM_PUBORECT("MDC_MUSC_ABDOM_PUBORECT", 584, 7);

  private MDC_MUSC_ABDOM_PUBORECT(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_ABDOM_PUBORECT get() {
    return _instance;
  }
}
