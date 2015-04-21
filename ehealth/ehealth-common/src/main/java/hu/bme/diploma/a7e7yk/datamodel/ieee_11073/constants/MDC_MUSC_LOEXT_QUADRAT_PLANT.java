
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_LOEXT_QUADRAT_PLANT extends MdcNomenclatureValue {

  private static final MDC_MUSC_LOEXT_QUADRAT_PLANT _instance = new MDC_MUSC_LOEXT_QUADRAT_PLANT("MDC_MUSC_LOEXT_QUADRAT_PLANT", 980, 7);

  private MDC_MUSC_LOEXT_QUADRAT_PLANT(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_LOEXT_QUADRAT_PLANT get() {
    return _instance;
  }
}
