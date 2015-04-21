
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_HEAD_FACIAL extends MdcNomenclatureValue {

  private static final MDC_MUSC_HEAD_FACIAL _instance = new MDC_MUSC_HEAD_FACIAL("MDC_MUSC_HEAD_FACIAL", 284, 7);

  private MDC_MUSC_HEAD_FACIAL(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_HEAD_FACIAL get() {
    return _instance;
  }
}
