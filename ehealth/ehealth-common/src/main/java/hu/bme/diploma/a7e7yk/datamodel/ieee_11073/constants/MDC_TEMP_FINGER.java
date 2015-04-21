
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_TEMP_FINGER extends MdcNomenclatureValue {

  private static final MDC_TEMP_FINGER _instance = new MDC_TEMP_FINGER("MDC_TEMP_FINGER", 57360, 2);

  private MDC_TEMP_FINGER(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_TEMP_FINGER get() {
    return _instance;
  }
}
