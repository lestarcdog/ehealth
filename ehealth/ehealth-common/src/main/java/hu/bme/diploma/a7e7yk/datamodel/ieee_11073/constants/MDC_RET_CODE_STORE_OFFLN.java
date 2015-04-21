
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_RET_CODE_STORE_OFFLN extends MdcNomenclatureValue {

  private static final MDC_RET_CODE_STORE_OFFLN _instance = new MDC_RET_CODE_STORE_OFFLN("MDC_RET_CODE_STORE_OFFLN", 2001, 255);

  private MDC_RET_CODE_STORE_OFFLN(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_RET_CODE_STORE_OFFLN get() {
    return _instance;
  }
}
