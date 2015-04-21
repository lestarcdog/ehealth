
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_HEAD_EYE extends MdcNomenclatureValue {

  private static final MDC_MUSC_HEAD_EYE _instance = new MDC_MUSC_HEAD_EYE("MDC_MUSC_HEAD_EYE", 256, 7);

  private MDC_MUSC_HEAD_EYE(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_HEAD_EYE get() {
    return _instance;
  }
}
