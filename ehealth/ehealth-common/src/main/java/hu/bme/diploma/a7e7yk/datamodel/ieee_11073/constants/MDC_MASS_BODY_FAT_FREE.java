
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MASS_BODY_FAT_FREE extends MdcNomenclatureValue {

  private static final MDC_MASS_BODY_FAT_FREE _instance = new MDC_MASS_BODY_FAT_FREE("MDC_MASS_BODY_FAT_FREE", 57684, 2);

  private MDC_MASS_BODY_FAT_FREE(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MASS_BODY_FAT_FREE get() {
    return _instance;
  }
}
