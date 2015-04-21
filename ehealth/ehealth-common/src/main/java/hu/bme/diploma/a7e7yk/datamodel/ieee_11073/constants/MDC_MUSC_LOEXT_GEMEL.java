
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_LOEXT_GEMEL extends MdcNomenclatureValue {

  private static final MDC_MUSC_LOEXT_GEMEL _instance = new MDC_MUSC_LOEXT_GEMEL("MDC_MUSC_LOEXT_GEMEL", 820, 7);

  private MDC_MUSC_LOEXT_GEMEL(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_LOEXT_GEMEL get() {
    return _instance;
  }
}
