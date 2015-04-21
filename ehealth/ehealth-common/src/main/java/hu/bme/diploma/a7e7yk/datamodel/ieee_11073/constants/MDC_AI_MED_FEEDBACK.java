
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_AI_MED_FEEDBACK extends MdcNomenclatureValue {

  private static final MDC_AI_MED_FEEDBACK _instance = new MDC_AI_MED_FEEDBACK("MDC_AI_MED_FEEDBACK", 13315, 130);

  private MDC_AI_MED_FEEDBACK(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_AI_MED_FEEDBACK get() {
    return _instance;
  }
}
