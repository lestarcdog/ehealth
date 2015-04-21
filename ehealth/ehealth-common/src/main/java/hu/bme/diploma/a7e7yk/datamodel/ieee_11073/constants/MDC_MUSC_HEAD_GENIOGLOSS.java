
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_HEAD_GENIOGLOSS extends MdcNomenclatureValue {

  private static final MDC_MUSC_HEAD_GENIOGLOSS _instance = new MDC_MUSC_HEAD_GENIOGLOSS("MDC_MUSC_HEAD_GENIOGLOSS", 372, 7);

  private MDC_MUSC_HEAD_GENIOGLOSS(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_HEAD_GENIOGLOSS get() {
    return _instance;
  }
}
