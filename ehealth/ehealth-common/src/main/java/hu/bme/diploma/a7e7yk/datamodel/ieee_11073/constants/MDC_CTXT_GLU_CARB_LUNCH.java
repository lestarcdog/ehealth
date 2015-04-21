
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_CTXT_GLU_CARB_LUNCH extends MdcNomenclatureValue {

  private static final MDC_CTXT_GLU_CARB_LUNCH _instance = new MDC_CTXT_GLU_CARB_LUNCH("MDC_CTXT_GLU_CARB_LUNCH", 29164, 128);

  private MDC_CTXT_GLU_CARB_LUNCH(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_CTXT_GLU_CARB_LUNCH get() {
    return _instance;
  }
}
