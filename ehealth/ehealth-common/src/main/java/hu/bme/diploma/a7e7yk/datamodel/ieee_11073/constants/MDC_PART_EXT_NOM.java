
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_PART_EXT_NOM extends MdcNomenclatureValue {

  private static final MDC_PART_EXT_NOM _instance = new MDC_PART_EXT_NOM("MDC_PART_EXT_NOM", 256, 0);

  private MDC_PART_EXT_NOM(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_PART_EXT_NOM get() {
    return _instance;
  }
}
