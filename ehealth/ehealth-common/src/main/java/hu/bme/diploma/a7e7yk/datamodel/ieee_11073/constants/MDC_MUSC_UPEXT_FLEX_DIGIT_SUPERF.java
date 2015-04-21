
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_UPEXT_FLEX_DIGIT_SUPERF extends MdcNomenclatureValue {

  private static final MDC_MUSC_UPEXT_FLEX_DIGIT_SUPERF _instance = new MDC_MUSC_UPEXT_FLEX_DIGIT_SUPERF("MDC_MUSC_UPEXT_FLEX_DIGIT_SUPERF", 676, 7);

  private MDC_MUSC_UPEXT_FLEX_DIGIT_SUPERF(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_UPEXT_FLEX_DIGIT_SUPERF get() {
    return _instance;
  }
}
