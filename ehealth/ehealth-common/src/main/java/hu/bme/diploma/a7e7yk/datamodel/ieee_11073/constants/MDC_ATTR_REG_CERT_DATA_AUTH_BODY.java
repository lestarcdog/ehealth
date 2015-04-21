
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_ATTR_REG_CERT_DATA_AUTH_BODY extends MdcNomenclatureValue {

  private static final MDC_ATTR_REG_CERT_DATA_AUTH_BODY _instance = new MDC_ATTR_REG_CERT_DATA_AUTH_BODY("MDC_ATTR_REG_CERT_DATA_AUTH_BODY", 2682, 1);

  private MDC_ATTR_REG_CERT_DATA_AUTH_BODY(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_ATTR_REG_CERT_DATA_AUTH_BODY get() {
    return _instance;
  }
}
