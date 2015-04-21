
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_PART_RET_CODE extends MdcNomenclatureValue {

  private static final MDC_PART_RET_CODE _instance = new MDC_PART_RET_CODE("MDC_PART_RET_CODE", 255, 0);

  private MDC_PART_RET_CODE(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_PART_RET_CODE get() {
    return _instance;
  }
}
