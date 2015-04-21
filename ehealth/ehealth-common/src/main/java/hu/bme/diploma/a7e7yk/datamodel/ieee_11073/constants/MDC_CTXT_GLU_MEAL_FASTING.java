
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_CTXT_GLU_MEAL_FASTING extends MdcNomenclatureValue {

  private static final MDC_CTXT_GLU_MEAL_FASTING _instance = new MDC_CTXT_GLU_MEAL_FASTING("MDC_CTXT_GLU_MEAL_FASTING", 29268, 128);

  private MDC_CTXT_GLU_MEAL_FASTING(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_CTXT_GLU_MEAL_FASTING get() {
    return _instance;
  }
}
