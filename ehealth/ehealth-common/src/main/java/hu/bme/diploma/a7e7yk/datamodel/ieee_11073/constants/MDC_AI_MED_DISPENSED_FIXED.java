
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_AI_MED_DISPENSED_FIXED extends MdcNomenclatureValue {

  private static final MDC_AI_MED_DISPENSED_FIXED _instance = new MDC_AI_MED_DISPENSED_FIXED("MDC_AI_MED_DISPENSED_FIXED", 13312, 130);

  private MDC_AI_MED_DISPENSED_FIXED(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_AI_MED_DISPENSED_FIXED get() {
    return _instance;
  }
}
