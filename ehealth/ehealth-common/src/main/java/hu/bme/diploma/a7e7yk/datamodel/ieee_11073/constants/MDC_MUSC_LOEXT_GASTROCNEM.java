
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_LOEXT_GASTROCNEM extends MdcNomenclatureValue {

  private static final MDC_MUSC_LOEXT_GASTROCNEM _instance = new MDC_MUSC_LOEXT_GASTROCNEM("MDC_MUSC_LOEXT_GASTROCNEM", 920, 7);

  private MDC_MUSC_LOEXT_GASTROCNEM(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_LOEXT_GASTROCNEM get() {
    return _instance;
  }
}
