
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_HEAD_THYROARYTEROID extends MdcNomenclatureValue {

  private static final MDC_MUSC_HEAD_THYROARYTEROID _instance = new MDC_MUSC_HEAD_THYROARYTEROID("MDC_MUSC_HEAD_THYROARYTEROID", 384, 7);

  private MDC_MUSC_HEAD_THYROARYTEROID(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_HEAD_THYROARYTEROID get() {
    return _instance;
  }
}
