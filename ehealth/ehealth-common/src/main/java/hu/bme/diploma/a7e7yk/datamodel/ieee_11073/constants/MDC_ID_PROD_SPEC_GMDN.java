
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_ID_PROD_SPEC_GMDN extends MdcNomenclatureValue {

  private static final MDC_ID_PROD_SPEC_GMDN _instance = new MDC_ID_PROD_SPEC_GMDN("MDC_ID_PROD_SPEC_GMDN", 7690, 8);

  private MDC_ID_PROD_SPEC_GMDN(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_ID_PROD_SPEC_GMDN get() {
    return _instance;
  }
}
