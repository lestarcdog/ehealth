
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_HEAD_OBLIQ_SUP extends MdcNomenclatureValue {

  private static final MDC_MUSC_HEAD_OBLIQ_SUP _instance = new MDC_MUSC_HEAD_OBLIQ_SUP("MDC_MUSC_HEAD_OBLIQ_SUP", 276, 7);

  private MDC_MUSC_HEAD_OBLIQ_SUP(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_HEAD_OBLIQ_SUP get() {
    return _instance;
  }
}
