
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_LOEXT_ILLIOPS extends MdcNomenclatureValue {

  private static final MDC_MUSC_LOEXT_ILLIOPS _instance = new MDC_MUSC_LOEXT_ILLIOPS("MDC_MUSC_LOEXT_ILLIOPS", 792, 7);

  private MDC_MUSC_LOEXT_ILLIOPS(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_LOEXT_ILLIOPS get() {
    return _instance;
  }
}
