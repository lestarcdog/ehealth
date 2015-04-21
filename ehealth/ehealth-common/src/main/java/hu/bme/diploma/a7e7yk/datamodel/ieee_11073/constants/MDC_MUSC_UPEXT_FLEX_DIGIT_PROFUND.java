
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_UPEXT_FLEX_DIGIT_PROFUND extends MdcNomenclatureValue {

  private static final MDC_MUSC_UPEXT_FLEX_DIGIT_PROFUND _instance = new MDC_MUSC_UPEXT_FLEX_DIGIT_PROFUND("MDC_MUSC_UPEXT_FLEX_DIGIT_PROFUND", 680, 7);

  private MDC_MUSC_UPEXT_FLEX_DIGIT_PROFUND(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_UPEXT_FLEX_DIGIT_PROFUND get() {
    return _instance;
  }
}
