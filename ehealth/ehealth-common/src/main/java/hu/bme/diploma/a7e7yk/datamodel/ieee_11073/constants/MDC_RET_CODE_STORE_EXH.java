
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_RET_CODE_STORE_EXH extends MdcNomenclatureValue {

  private static final MDC_RET_CODE_STORE_EXH _instance = new MDC_RET_CODE_STORE_EXH("MDC_RET_CODE_STORE_EXH", 2000, 255);

  private MDC_RET_CODE_STORE_EXH(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_RET_CODE_STORE_EXH get() {
    return _instance;
  }
}
