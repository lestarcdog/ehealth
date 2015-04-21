
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_HEAD_LING extends MdcNomenclatureValue {

  private static final MDC_MUSC_HEAD_LING _instance = new MDC_MUSC_HEAD_LING("MDC_MUSC_HEAD_LING", 368, 7);

  private MDC_MUSC_HEAD_LING(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_HEAD_LING get() {
    return _instance;
  }
}
