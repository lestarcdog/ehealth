
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_TEMP_ORAL extends MdcNomenclatureValue {

  private static final MDC_TEMP_ORAL _instance = new MDC_TEMP_ORAL("MDC_TEMP_ORAL", 57352, 2);

  private MDC_TEMP_ORAL(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_TEMP_ORAL get() {
    return _instance;
  }
}
