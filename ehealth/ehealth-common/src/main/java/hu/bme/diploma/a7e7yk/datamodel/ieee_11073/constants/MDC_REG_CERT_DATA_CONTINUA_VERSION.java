
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_REG_CERT_DATA_CONTINUA_VERSION extends MdcNomenclatureValue {

  private static final MDC_REG_CERT_DATA_CONTINUA_VERSION _instance = new MDC_REG_CERT_DATA_CONTINUA_VERSION("MDC_REG_CERT_DATA_CONTINUA_VERSION", 64512, 8);

  private MDC_REG_CERT_DATA_CONTINUA_VERSION(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_REG_CERT_DATA_CONTINUA_VERSION get() {
    return _instance;
  }
}
