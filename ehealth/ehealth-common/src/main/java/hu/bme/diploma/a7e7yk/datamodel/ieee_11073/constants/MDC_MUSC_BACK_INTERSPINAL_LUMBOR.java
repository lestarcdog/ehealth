
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_BACK_INTERSPINAL_LUMBOR extends MdcNomenclatureValue {

  private static final MDC_MUSC_BACK_INTERSPINAL_LUMBOR _instance = new MDC_MUSC_BACK_INTERSPINAL_LUMBOR("MDC_MUSC_BACK_INTERSPINAL_LUMBOR", 524, 7);

  private MDC_MUSC_BACK_INTERSPINAL_LUMBOR(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_BACK_INTERSPINAL_LUMBOR get() {
    return _instance;
  }
}
