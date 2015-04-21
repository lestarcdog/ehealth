
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_LOEXT_HIP_THIGH extends MdcNomenclatureValue {

  private static final MDC_MUSC_LOEXT_HIP_THIGH _instance = new MDC_MUSC_LOEXT_HIP_THIGH("MDC_MUSC_LOEXT_HIP_THIGH", 780, 7);

  private MDC_MUSC_LOEXT_HIP_THIGH(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_LOEXT_HIP_THIGH get() {
    return _instance;
  }
}
