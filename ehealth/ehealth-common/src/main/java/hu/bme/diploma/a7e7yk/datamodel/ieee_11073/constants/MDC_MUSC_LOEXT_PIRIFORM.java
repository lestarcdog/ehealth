
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_LOEXT_PIRIFORM extends MdcNomenclatureValue {

  private static final MDC_MUSC_LOEXT_PIRIFORM _instance = new MDC_MUSC_LOEXT_PIRIFORM("MDC_MUSC_LOEXT_PIRIFORM", 812, 7);

  private MDC_MUSC_LOEXT_PIRIFORM(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_LOEXT_PIRIFORM get() {
    return _instance;
  }
}
