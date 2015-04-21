
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_AI_MED_UF_TYPE_1_100 extends MdcNomenclatureValue {

  private static final MDC_AI_MED_UF_TYPE_1_100 _instance = new MDC_AI_MED_UF_TYPE_1_100("MDC_AI_MED_UF_TYPE_1_100", 13320, 130);

  private MDC_AI_MED_UF_TYPE_1_100(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_AI_MED_UF_TYPE_1_100 get() {
    return _instance;
  }
}
