
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_TEMP_TOE extends MdcNomenclatureValue {

  private static final MDC_TEMP_TOE _instance = new MDC_TEMP_TOE("MDC_TEMP_TOE", 57376, 2);

  private MDC_TEMP_TOE(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_TEMP_TOE get() {
    return _instance;
  }
}
