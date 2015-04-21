
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_REG_CERT_DATA_CONTINUA_REG_STATUS extends MdcNomenclatureValue {

  private static final MDC_REG_CERT_DATA_CONTINUA_REG_STATUS _instance = new MDC_REG_CERT_DATA_CONTINUA_REG_STATUS("MDC_REG_CERT_DATA_CONTINUA_REG_STATUS", 64514, 8);

  private MDC_REG_CERT_DATA_CONTINUA_REG_STATUS(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_REG_CERT_DATA_CONTINUA_REG_STATUS get() {
    return _instance;
  }
}
