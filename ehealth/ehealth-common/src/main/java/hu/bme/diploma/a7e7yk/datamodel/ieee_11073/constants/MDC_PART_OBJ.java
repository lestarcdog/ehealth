
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_PART_OBJ extends MdcNomenclatureValue {

  private static final MDC_PART_OBJ _instance = new MDC_PART_OBJ("MDC_PART_OBJ", 1, 0);

  private MDC_PART_OBJ(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_PART_OBJ get() {
    return _instance;
  }
}
