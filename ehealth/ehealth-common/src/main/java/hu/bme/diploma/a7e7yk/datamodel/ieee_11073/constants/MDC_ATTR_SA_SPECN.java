
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_ATTR_SA_SPECN extends MdcNomenclatureValue {

  private static final MDC_ATTR_SA_SPECN _instance = new MDC_ATTR_SA_SPECN("MDC_ATTR_SA_SPECN", 2413, 1);

  private MDC_ATTR_SA_SPECN(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_ATTR_SA_SPECN get() {
    return _instance;
  }
}
