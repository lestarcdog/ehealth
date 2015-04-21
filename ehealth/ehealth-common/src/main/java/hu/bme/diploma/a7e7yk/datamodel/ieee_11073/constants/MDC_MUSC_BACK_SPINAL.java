
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_BACK_SPINAL extends MdcNomenclatureValue {

  private static final MDC_MUSC_BACK_SPINAL _instance = new MDC_MUSC_BACK_SPINAL("MDC_MUSC_BACK_SPINAL", 476, 7);

  private MDC_MUSC_BACK_SPINAL(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_BACK_SPINAL get() {
    return _instance;
  }
}
