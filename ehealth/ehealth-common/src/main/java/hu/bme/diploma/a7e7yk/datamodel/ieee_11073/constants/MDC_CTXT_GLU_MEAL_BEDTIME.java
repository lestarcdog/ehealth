
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_CTXT_GLU_MEAL_BEDTIME extends MdcNomenclatureValue {

  private static final MDC_CTXT_GLU_MEAL_BEDTIME _instance = new MDC_CTXT_GLU_MEAL_BEDTIME("MDC_CTXT_GLU_MEAL_BEDTIME", 29300, 128);

  private MDC_CTXT_GLU_MEAL_BEDTIME(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_CTXT_GLU_MEAL_BEDTIME get() {
    return _instance;
  }
}
