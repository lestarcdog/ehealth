
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_BACK_SPLEN extends MdcNomenclatureValue {

  private static final MDC_MUSC_BACK_SPLEN _instance = new MDC_MUSC_BACK_SPLEN("MDC_MUSC_BACK_SPLEN", 468, 7);

  private MDC_MUSC_BACK_SPLEN(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_BACK_SPLEN get() {
    return _instance;
  }
}
