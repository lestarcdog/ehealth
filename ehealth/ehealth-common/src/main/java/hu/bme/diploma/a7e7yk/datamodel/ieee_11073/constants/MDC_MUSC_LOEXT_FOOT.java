
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_LOEXT_FOOT extends MdcNomenclatureValue {

  private static final MDC_MUSC_LOEXT_FOOT _instance = new MDC_MUSC_LOEXT_FOOT("MDC_MUSC_LOEXT_FOOT", 788, 7);

  private MDC_MUSC_LOEXT_FOOT(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_LOEXT_FOOT get() {
    return _instance;
  }
}
