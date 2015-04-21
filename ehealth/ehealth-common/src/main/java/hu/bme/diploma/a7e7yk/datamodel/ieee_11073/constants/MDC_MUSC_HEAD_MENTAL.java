
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_HEAD_MENTAL extends MdcNomenclatureValue {

  private static final MDC_MUSC_HEAD_MENTAL _instance = new MDC_MUSC_HEAD_MENTAL("MDC_MUSC_HEAD_MENTAL", 344, 7);

  private MDC_MUSC_HEAD_MENTAL(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_HEAD_MENTAL get() {
    return _instance;
  }
}
