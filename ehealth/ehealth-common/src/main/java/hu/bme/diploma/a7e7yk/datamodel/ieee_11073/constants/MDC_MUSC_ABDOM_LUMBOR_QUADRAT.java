
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_ABDOM_LUMBOR_QUADRAT extends MdcNomenclatureValue {

  private static final MDC_MUSC_ABDOM_LUMBOR_QUADRAT _instance = new MDC_MUSC_ABDOM_LUMBOR_QUADRAT("MDC_MUSC_ABDOM_LUMBOR_QUADRAT", 576, 7);

  private MDC_MUSC_ABDOM_LUMBOR_QUADRAT(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_ABDOM_LUMBOR_QUADRAT get() {
    return _instance;
  }
}
