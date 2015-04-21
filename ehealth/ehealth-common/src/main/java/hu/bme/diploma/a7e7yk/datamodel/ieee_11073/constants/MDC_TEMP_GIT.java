
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_TEMP_GIT extends MdcNomenclatureValue {

  private static final MDC_TEMP_GIT _instance = new MDC_TEMP_GIT("MDC_TEMP_GIT", 57384, 2);

  private MDC_TEMP_GIT(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_TEMP_GIT get() {
    return _instance;
  }
}
