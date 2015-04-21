
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_LOEXT_INTEROSS_PLANTAR extends MdcNomenclatureValue {

  private static final MDC_MUSC_LOEXT_INTEROSS_PLANTAR _instance = new MDC_MUSC_LOEXT_INTEROSS_PLANTAR("MDC_MUSC_LOEXT_INTEROSS_PLANTAR", 992, 7);

  private MDC_MUSC_LOEXT_INTEROSS_PLANTAR(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_LOEXT_INTEROSS_PLANTAR get() {
    return _instance;
  }
}
