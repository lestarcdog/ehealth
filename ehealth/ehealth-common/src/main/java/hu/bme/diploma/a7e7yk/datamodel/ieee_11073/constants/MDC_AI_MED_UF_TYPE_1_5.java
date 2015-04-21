
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_AI_MED_UF_TYPE_1_5 extends MdcNomenclatureValue {

  private static final MDC_AI_MED_UF_TYPE_1_5 _instance = new MDC_AI_MED_UF_TYPE_1_5("MDC_AI_MED_UF_TYPE_1_5", 13319, 130);

  private MDC_AI_MED_UF_TYPE_1_5(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_AI_MED_UF_TYPE_1_5 get() {
    return _instance;
  }
}
