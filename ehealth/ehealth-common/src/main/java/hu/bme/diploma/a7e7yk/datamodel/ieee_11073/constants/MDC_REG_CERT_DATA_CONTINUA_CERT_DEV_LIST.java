
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_REG_CERT_DATA_CONTINUA_CERT_DEV_LIST extends MdcNomenclatureValue {

  private static final MDC_REG_CERT_DATA_CONTINUA_CERT_DEV_LIST _instance = new MDC_REG_CERT_DATA_CONTINUA_CERT_DEV_LIST("MDC_REG_CERT_DATA_CONTINUA_CERT_DEV_LIST", 64513, 8);

  private MDC_REG_CERT_DATA_CONTINUA_CERT_DEV_LIST(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_REG_CERT_DATA_CONTINUA_CERT_DEV_LIST get() {
    return _instance;
  }
}
