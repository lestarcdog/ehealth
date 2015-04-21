
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_TEMP_AXILLA extends MdcNomenclatureValue {

  private static final MDC_TEMP_AXILLA _instance = new MDC_TEMP_AXILLA("MDC_TEMP_AXILLA", 57380, 2);

  private MDC_TEMP_AXILLA(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_TEMP_AXILLA get() {
    return _instance;
  }
}
