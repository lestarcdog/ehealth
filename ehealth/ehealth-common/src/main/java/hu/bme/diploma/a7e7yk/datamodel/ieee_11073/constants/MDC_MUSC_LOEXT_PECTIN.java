
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_LOEXT_PECTIN extends MdcNomenclatureValue {

  private static final MDC_MUSC_LOEXT_PECTIN _instance = new MDC_MUSC_LOEXT_PECTIN("MDC_MUSC_LOEXT_PECTIN", 852, 7);

  private MDC_MUSC_LOEXT_PECTIN(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_LOEXT_PECTIN get() {
    return _instance;
  }
}
