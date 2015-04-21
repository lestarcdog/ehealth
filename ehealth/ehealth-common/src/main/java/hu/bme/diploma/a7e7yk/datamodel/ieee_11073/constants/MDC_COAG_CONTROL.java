
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_COAG_CONTROL extends MdcNomenclatureValue {

  private static final MDC_COAG_CONTROL _instance = new MDC_COAG_CONTROL("MDC_COAG_CONTROL", 29204, 2);

  private MDC_COAG_CONTROL(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_COAG_CONTROL get() {
    return _instance;
  }
}
