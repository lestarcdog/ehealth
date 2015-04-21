
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_ID_PROD_SPEC_UNSPECIFIED extends MdcNomenclatureValue {

  private static final MDC_ID_PROD_SPEC_UNSPECIFIED _instance = new MDC_ID_PROD_SPEC_UNSPECIFIED("MDC_ID_PROD_SPEC_UNSPECIFIED", 7683, 8);

  private MDC_ID_PROD_SPEC_UNSPECIFIED(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_ID_PROD_SPEC_UNSPECIFIED get() {
    return _instance;
  }
}
