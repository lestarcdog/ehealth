
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_CTXT_GLU_CARB_DRINK extends MdcNomenclatureValue {

  private static final MDC_CTXT_GLU_CARB_DRINK _instance = new MDC_CTXT_GLU_CARB_DRINK("MDC_CTXT_GLU_CARB_DRINK", 29176, 128);

  private MDC_CTXT_GLU_CARB_DRINK(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_CTXT_GLU_CARB_DRINK get() {
    return _instance;
  }
}
