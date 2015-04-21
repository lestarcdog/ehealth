
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_ID_PROD_SPEC_PART extends MdcNomenclatureValue {

  private static final MDC_ID_PROD_SPEC_PART _instance = new MDC_ID_PROD_SPEC_PART("MDC_ID_PROD_SPEC_PART", 7685, 8);

  private MDC_ID_PROD_SPEC_PART(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_ID_PROD_SPEC_PART get() {
    return _instance;
  }
}
