
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_INS_DELIV_BASAL_TEMP_REL extends MdcNomenclatureValue {

  private static final MDC_INS_DELIV_BASAL_TEMP_REL _instance = new MDC_INS_DELIV_BASAL_TEMP_REL("MDC_INS_DELIV_BASAL_TEMP_REL", 58372, 2);

  private MDC_INS_DELIV_BASAL_TEMP_REL(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_INS_DELIV_BASAL_TEMP_REL get() {
    return _instance;
  }
}
