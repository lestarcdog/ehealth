
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_ID_PROD_SPEC_PROTOCOL_REV extends MdcNomenclatureValue {

  private static final MDC_ID_PROD_SPEC_PROTOCOL_REV _instance = new MDC_ID_PROD_SPEC_PROTOCOL_REV("MDC_ID_PROD_SPEC_PROTOCOL_REV", 7689, 8);

  private MDC_ID_PROD_SPEC_PROTOCOL_REV(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_ID_PROD_SPEC_PROTOCOL_REV get() {
    return _instance;
  }
}
