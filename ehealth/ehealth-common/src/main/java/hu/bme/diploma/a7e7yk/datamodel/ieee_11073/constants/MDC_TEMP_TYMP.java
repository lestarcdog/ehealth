
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_TEMP_TYMP extends MdcNomenclatureValue {

  private static final MDC_TEMP_TYMP _instance = new MDC_TEMP_TYMP("MDC_TEMP_TYMP", 19320, 2);

  private MDC_TEMP_TYMP(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_TEMP_TYMP get() {
    return _instance;
  }
}
