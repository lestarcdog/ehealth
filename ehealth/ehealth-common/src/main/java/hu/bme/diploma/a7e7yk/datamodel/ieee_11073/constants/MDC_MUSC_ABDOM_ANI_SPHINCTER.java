
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_ABDOM_ANI_SPHINCTER extends MdcNomenclatureValue {

  private static final MDC_MUSC_ABDOM_ANI_SPHINCTER _instance = new MDC_MUSC_ABDOM_ANI_SPHINCTER("MDC_MUSC_ABDOM_ANI_SPHINCTER", 592, 7);

  private MDC_MUSC_ABDOM_ANI_SPHINCTER(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_ABDOM_ANI_SPHINCTER get() {
    return _instance;
  }
}
