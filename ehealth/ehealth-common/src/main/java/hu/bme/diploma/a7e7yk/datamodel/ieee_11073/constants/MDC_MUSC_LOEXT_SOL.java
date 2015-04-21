
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_LOEXT_SOL extends MdcNomenclatureValue {

  private static final MDC_MUSC_LOEXT_SOL _instance = new MDC_MUSC_LOEXT_SOL("MDC_MUSC_LOEXT_SOL", 932, 7);

  private MDC_MUSC_LOEXT_SOL(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_LOEXT_SOL get() {
    return _instance;
  }
}
