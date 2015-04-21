
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_AI_MED_UF_TYPE_YESNO extends MdcNomenclatureValue {

  private static final MDC_AI_MED_UF_TYPE_YESNO _instance = new MDC_AI_MED_UF_TYPE_YESNO("MDC_AI_MED_UF_TYPE_YESNO", 13318, 130);

  private MDC_AI_MED_UF_TYPE_YESNO(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_AI_MED_UF_TYPE_YESNO get() {
    return _instance;
  }
}
