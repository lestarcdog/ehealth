
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_BODY_FAT extends MdcNomenclatureValue {

  private static final MDC_BODY_FAT _instance = new MDC_BODY_FAT("MDC_BODY_FAT", 57676, 2);

  private MDC_BODY_FAT(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_BODY_FAT get() {
    return _instance;
  }
}
