
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_CTXT_GLU_CARB_DINNER extends MdcNomenclatureValue {

  private static final MDC_CTXT_GLU_CARB_DINNER _instance = new MDC_CTXT_GLU_CARB_DINNER("MDC_CTXT_GLU_CARB_DINNER", 29168, 128);

  private MDC_CTXT_GLU_CARB_DINNER(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_CTXT_GLU_CARB_DINNER get() {
    return _instance;
  }
}
