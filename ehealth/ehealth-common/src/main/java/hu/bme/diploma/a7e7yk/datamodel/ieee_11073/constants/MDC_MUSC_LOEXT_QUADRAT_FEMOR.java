
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_LOEXT_QUADRAT_FEMOR extends MdcNomenclatureValue {

  private static final MDC_MUSC_LOEXT_QUADRAT_FEMOR _instance = new MDC_MUSC_LOEXT_QUADRAT_FEMOR("MDC_MUSC_LOEXT_QUADRAT_FEMOR", 824, 7);

  private MDC_MUSC_LOEXT_QUADRAT_FEMOR(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_LOEXT_QUADRAT_FEMOR get() {
    return _instance;
  }
}
