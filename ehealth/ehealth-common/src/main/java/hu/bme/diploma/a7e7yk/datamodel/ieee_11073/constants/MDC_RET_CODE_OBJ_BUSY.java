
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_RET_CODE_OBJ_BUSY extends MdcNomenclatureValue {

  private static final MDC_RET_CODE_OBJ_BUSY _instance = new MDC_RET_CODE_OBJ_BUSY("MDC_RET_CODE_OBJ_BUSY", 1000, 255);

  private MDC_RET_CODE_OBJ_BUSY(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_RET_CODE_OBJ_BUSY get() {
    return _instance;
  }
}
