
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_ID_PROD_SPEC_SW extends MdcNomenclatureValue {

  private static final MDC_ID_PROD_SPEC_SW _instance = new MDC_ID_PROD_SPEC_SW("MDC_ID_PROD_SPEC_SW", 7687, 8);

  private MDC_ID_PROD_SPEC_SW(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_ID_PROD_SPEC_SW get() {
    return _instance;
  }
}
