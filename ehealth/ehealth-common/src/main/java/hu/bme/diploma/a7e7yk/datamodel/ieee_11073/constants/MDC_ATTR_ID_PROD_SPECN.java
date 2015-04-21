
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_ATTR_ID_PROD_SPECN extends MdcNomenclatureValue {

  private static final MDC_ATTR_ID_PROD_SPECN _instance = new MDC_ATTR_ID_PROD_SPECN("MDC_ATTR_ID_PROD_SPECN", 2349, 1);

  private MDC_ATTR_ID_PROD_SPECN(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_ATTR_ID_PROD_SPECN get() {
    return _instance;
  }
}
