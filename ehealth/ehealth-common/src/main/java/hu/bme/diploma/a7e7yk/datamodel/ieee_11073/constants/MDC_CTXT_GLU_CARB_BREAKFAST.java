
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_CTXT_GLU_CARB_BREAKFAST extends MdcNomenclatureValue {

  private static final MDC_CTXT_GLU_CARB_BREAKFAST _instance = new MDC_CTXT_GLU_CARB_BREAKFAST("MDC_CTXT_GLU_CARB_BREAKFAST", 29160, 128);

  private MDC_CTXT_GLU_CARB_BREAKFAST(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_CTXT_GLU_CARB_BREAKFAST get() {
    return _instance;
  }
}
