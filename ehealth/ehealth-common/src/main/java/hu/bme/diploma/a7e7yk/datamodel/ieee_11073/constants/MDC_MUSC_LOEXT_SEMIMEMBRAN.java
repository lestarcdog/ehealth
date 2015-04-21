
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_LOEXT_SEMIMEMBRAN extends MdcNomenclatureValue {

  private static final MDC_MUSC_LOEXT_SEMIMEMBRAN _instance = new MDC_MUSC_LOEXT_SEMIMEMBRAN("MDC_MUSC_LOEXT_SEMIMEMBRAN", 888, 7);

  private MDC_MUSC_LOEXT_SEMIMEMBRAN(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_LOEXT_SEMIMEMBRAN get() {
    return _instance;
  }
}
