
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_TEMP_EAR extends MdcNomenclatureValue {

  private static final MDC_TEMP_EAR _instance = new MDC_TEMP_EAR("MDC_TEMP_EAR", 57356, 2);

  private MDC_TEMP_EAR(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_TEMP_EAR get() {
    return _instance;
  }
}
