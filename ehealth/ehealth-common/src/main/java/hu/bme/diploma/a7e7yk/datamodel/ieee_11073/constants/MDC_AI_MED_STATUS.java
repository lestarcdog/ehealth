
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_AI_MED_STATUS extends MdcNomenclatureValue {

  private static final MDC_AI_MED_STATUS _instance = new MDC_AI_MED_STATUS("MDC_AI_MED_STATUS", 13314, 130);

  private MDC_AI_MED_STATUS(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_AI_MED_STATUS get() {
    return _instance;
  }
}
