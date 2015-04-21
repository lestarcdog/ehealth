
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_CTXT_GLU_MEAL_POSTPRANDIAL extends MdcNomenclatureValue {

  private static final MDC_CTXT_GLU_MEAL_POSTPRANDIAL _instance = new MDC_CTXT_GLU_MEAL_POSTPRANDIAL("MDC_CTXT_GLU_MEAL_POSTPRANDIAL", 29264, 128);

  private MDC_CTXT_GLU_MEAL_POSTPRANDIAL(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_CTXT_GLU_MEAL_POSTPRANDIAL get() {
    return _instance;
  }
}
