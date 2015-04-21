
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_CTXT_GLU_MEAL_CASUAL extends MdcNomenclatureValue {

  private static final MDC_CTXT_GLU_MEAL_CASUAL _instance = new MDC_CTXT_GLU_MEAL_CASUAL("MDC_CTXT_GLU_MEAL_CASUAL", 29272, 128);

  private MDC_CTXT_GLU_MEAL_CASUAL(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_CTXT_GLU_MEAL_CASUAL get() {
    return _instance;
  }
}
