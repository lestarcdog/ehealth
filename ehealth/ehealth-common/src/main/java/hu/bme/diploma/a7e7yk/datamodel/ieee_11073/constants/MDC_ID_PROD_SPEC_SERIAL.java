
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_ID_PROD_SPEC_SERIAL extends MdcNomenclatureValue {

  private static final MDC_ID_PROD_SPEC_SERIAL _instance = new MDC_ID_PROD_SPEC_SERIAL("MDC_ID_PROD_SPEC_SERIAL", 7684, 8);

  private MDC_ID_PROD_SPEC_SERIAL(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_ID_PROD_SPEC_SERIAL get() {
    return _instance;
  }
}
