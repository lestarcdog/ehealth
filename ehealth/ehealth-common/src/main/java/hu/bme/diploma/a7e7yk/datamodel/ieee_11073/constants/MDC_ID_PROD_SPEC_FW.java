
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_ID_PROD_SPEC_FW extends MdcNomenclatureValue {

  private static final MDC_ID_PROD_SPEC_FW _instance = new MDC_ID_PROD_SPEC_FW("MDC_ID_PROD_SPEC_FW", 7688, 8);

  private MDC_ID_PROD_SPEC_FW(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_ID_PROD_SPEC_FW get() {
    return _instance;
  }
}
