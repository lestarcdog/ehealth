
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_HEAD_TEMPOR extends MdcNomenclatureValue {

  private static final MDC_MUSC_HEAD_TEMPOR _instance = new MDC_MUSC_HEAD_TEMPOR("MDC_MUSC_HEAD_TEMPOR", 352, 7);

  private MDC_MUSC_HEAD_TEMPOR(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_HEAD_TEMPOR get() {
    return _instance;
  }
}
