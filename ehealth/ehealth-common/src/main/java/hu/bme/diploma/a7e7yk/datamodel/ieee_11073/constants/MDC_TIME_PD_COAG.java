
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_TIME_PD_COAG extends MdcNomenclatureValue {

  private static final MDC_TIME_PD_COAG _instance = new MDC_TIME_PD_COAG("MDC_TIME_PD_COAG", 29192, 2);

  private MDC_TIME_PD_COAG(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_TIME_PD_COAG get() {
    return _instance;
  }
}
