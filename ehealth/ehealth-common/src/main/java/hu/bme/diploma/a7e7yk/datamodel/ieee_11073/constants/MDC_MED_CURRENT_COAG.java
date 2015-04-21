
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MED_CURRENT_COAG extends MdcNomenclatureValue {

  private static final MDC_MED_CURRENT_COAG _instance = new MDC_MED_CURRENT_COAG("MDC_MED_CURRENT_COAG", 29308, 128);

  private MDC_MED_CURRENT_COAG(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MED_CURRENT_COAG get() {
    return _instance;
  }
}
