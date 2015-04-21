
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_INFRA_HARMONIZATION_CONTINUA extends MdcNomenclatureValue {

  private static final MDC_INFRA_HARMONIZATION_CONTINUA _instance = new MDC_INFRA_HARMONIZATION_CONTINUA("MDC_INFRA_HARMONIZATION_CONTINUA", 7680, 8);

  private MDC_INFRA_HARMONIZATION_CONTINUA(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_INFRA_HARMONIZATION_CONTINUA get() {
    return _instance;
  }
}
