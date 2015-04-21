
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_LOEXT_TRICEPS_SUR extends MdcNomenclatureValue {

  private static final MDC_MUSC_LOEXT_TRICEPS_SUR _instance = new MDC_MUSC_LOEXT_TRICEPS_SUR("MDC_MUSC_LOEXT_TRICEPS_SUR", 916, 7);

  private MDC_MUSC_LOEXT_TRICEPS_SUR(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_LOEXT_TRICEPS_SUR get() {
    return _instance;
  }
}
