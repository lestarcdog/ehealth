
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_RATIO_INR_COAG extends MdcNomenclatureValue {

  private static final MDC_RATIO_INR_COAG _instance = new MDC_RATIO_INR_COAG("MDC_RATIO_INR_COAG", 29188, 2);

  private MDC_RATIO_INR_COAG(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_RATIO_INR_COAG get() {
    return _instance;
  }
}
