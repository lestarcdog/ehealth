
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_HEAD_MASSETER extends MdcNomenclatureValue {

  private static final MDC_MUSC_HEAD_MASSETER _instance = new MDC_MUSC_HEAD_MASSETER("MDC_MUSC_HEAD_MASSETER", 348, 7);

  private MDC_MUSC_HEAD_MASSETER(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_HEAD_MASSETER get() {
    return _instance;
  }
}
