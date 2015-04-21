
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_AI_MED_UF_RESPONSE extends MdcNomenclatureValue {

  private static final MDC_AI_MED_UF_RESPONSE _instance = new MDC_AI_MED_UF_RESPONSE("MDC_AI_MED_UF_RESPONSE", 13317, 130);

  private MDC_AI_MED_UF_RESPONSE(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_AI_MED_UF_RESPONSE get() {
    return _instance;
  }
}
