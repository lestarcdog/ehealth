
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_LOEXT_OBTURATOR extends MdcNomenclatureValue {

  private static final MDC_MUSC_LOEXT_OBTURATOR _instance = new MDC_MUSC_LOEXT_OBTURATOR("MDC_MUSC_LOEXT_OBTURATOR", 816, 7);

  private MDC_MUSC_LOEXT_OBTURATOR(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_LOEXT_OBTURATOR get() {
    return _instance;
  }
}
