
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_LAB_RESULT_POSITIVE_THREE extends MdcNomenclatureValue {

  private static final MDC_LAB_RESULT_POSITIVE_THREE _instance = new MDC_LAB_RESULT_POSITIVE_THREE("MDC_LAB_RESULT_POSITIVE_THREE", 57680, 128);

  private MDC_LAB_RESULT_POSITIVE_THREE(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_LAB_RESULT_POSITIVE_THREE get() {
    return _instance;
  }
}
