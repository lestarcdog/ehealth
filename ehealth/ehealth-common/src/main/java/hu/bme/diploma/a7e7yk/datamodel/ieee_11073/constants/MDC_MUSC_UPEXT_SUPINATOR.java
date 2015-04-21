
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_UPEXT_SUPINATOR extends MdcNomenclatureValue {

  private static final MDC_MUSC_UPEXT_SUPINATOR _instance = new MDC_MUSC_UPEXT_SUPINATOR("MDC_MUSC_UPEXT_SUPINATOR", 716, 7);

  private MDC_MUSC_UPEXT_SUPINATOR(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_UPEXT_SUPINATOR get() {
    return _instance;
  }
}
