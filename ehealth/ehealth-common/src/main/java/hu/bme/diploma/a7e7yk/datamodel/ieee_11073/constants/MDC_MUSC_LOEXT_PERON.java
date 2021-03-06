
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_LOEXT_PERON extends MdcNomenclatureValue {

  private static final MDC_MUSC_LOEXT_PERON _instance = new MDC_MUSC_LOEXT_PERON("MDC_MUSC_LOEXT_PERON", 904, 7);

  private MDC_MUSC_LOEXT_PERON(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_LOEXT_PERON get() {
    return _instance;
  }
}
