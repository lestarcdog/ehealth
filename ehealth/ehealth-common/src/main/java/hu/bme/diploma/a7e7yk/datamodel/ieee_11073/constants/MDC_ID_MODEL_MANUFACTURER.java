
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_ID_MODEL_MANUFACTURER extends MdcNomenclatureValue {

  private static final MDC_ID_MODEL_MANUFACTURER _instance = new MDC_ID_MODEL_MANUFACTURER("MDC_ID_MODEL_MANUFACTURER", 7682, 8);

  private MDC_ID_MODEL_MANUFACTURER(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_ID_MODEL_MANUFACTURER get() {
    return _instance;
  }
}
