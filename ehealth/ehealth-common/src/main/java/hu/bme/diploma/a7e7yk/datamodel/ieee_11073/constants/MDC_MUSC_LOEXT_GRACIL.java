
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_LOEXT_GRACIL extends MdcNomenclatureValue {

  private static final MDC_MUSC_LOEXT_GRACIL _instance = new MDC_MUSC_LOEXT_GRACIL("MDC_MUSC_LOEXT_GRACIL", 868, 7);

  private MDC_MUSC_LOEXT_GRACIL(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_LOEXT_GRACIL get() {
    return _instance;
  }
}
