
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_ID_PROD_SPEC_HW extends MdcNomenclatureValue {

  private static final MDC_ID_PROD_SPEC_HW _instance = new MDC_ID_PROD_SPEC_HW("MDC_ID_PROD_SPEC_HW", 7686, 8);

  private MDC_ID_PROD_SPEC_HW(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_ID_PROD_SPEC_HW get() {
    return _instance;
  }
}
