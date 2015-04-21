
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_LOEXT_LUMBRICAL extends MdcNomenclatureValue {

  private static final MDC_MUSC_LOEXT_LUMBRICAL _instance = new MDC_MUSC_LOEXT_LUMBRICAL("MDC_MUSC_LOEXT_LUMBRICAL", 984, 7);

  private MDC_MUSC_LOEXT_LUMBRICAL(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_LOEXT_LUMBRICAL get() {
    return _instance;
  }
}
