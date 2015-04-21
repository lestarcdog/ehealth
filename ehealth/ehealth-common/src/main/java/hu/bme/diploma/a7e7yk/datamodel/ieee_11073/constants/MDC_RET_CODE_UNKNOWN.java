
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_RET_CODE_UNKNOWN extends MdcNomenclatureValue {

  private static final MDC_RET_CODE_UNKNOWN _instance = new MDC_RET_CODE_UNKNOWN("MDC_RET_CODE_UNKNOWN", 1, 255);

  private MDC_RET_CODE_UNKNOWN(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_RET_CODE_UNKNOWN get() {
    return _instance;
  }
}
