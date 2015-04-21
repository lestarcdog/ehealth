
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_CTXT_GLU_MEAL_PREPRANDIAL extends MdcNomenclatureValue {

  private static final MDC_CTXT_GLU_MEAL_PREPRANDIAL _instance = new MDC_CTXT_GLU_MEAL_PREPRANDIAL("MDC_CTXT_GLU_MEAL_PREPRANDIAL", 29260, 128);

  private MDC_CTXT_GLU_MEAL_PREPRANDIAL(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_CTXT_GLU_MEAL_PREPRANDIAL get() {
    return _instance;
  }
}
