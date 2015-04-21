
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_HEAD_LARING extends MdcNomenclatureValue {

  private static final MDC_MUSC_HEAD_LARING _instance = new MDC_MUSC_HEAD_LARING("MDC_MUSC_HEAD_LARING", 376, 7);

  private MDC_MUSC_HEAD_LARING(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_HEAD_LARING get() {
    return _instance;
  }
}
