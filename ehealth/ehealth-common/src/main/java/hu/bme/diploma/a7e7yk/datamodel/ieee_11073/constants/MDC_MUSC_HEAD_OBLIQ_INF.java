
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_HEAD_OBLIQ_INF extends MdcNomenclatureValue {

  private static final MDC_MUSC_HEAD_OBLIQ_INF _instance = new MDC_MUSC_HEAD_OBLIQ_INF("MDC_MUSC_HEAD_OBLIQ_INF", 280, 7);

  private MDC_MUSC_HEAD_OBLIQ_INF(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_HEAD_OBLIQ_INF get() {
    return _instance;
  }
}
