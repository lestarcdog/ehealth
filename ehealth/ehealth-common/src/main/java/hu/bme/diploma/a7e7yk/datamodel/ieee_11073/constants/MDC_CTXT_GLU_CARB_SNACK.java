
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_CTXT_GLU_CARB_SNACK extends MdcNomenclatureValue {

  private static final MDC_CTXT_GLU_CARB_SNACK _instance = new MDC_CTXT_GLU_CARB_SNACK("MDC_CTXT_GLU_CARB_SNACK", 29172, 128);

  private MDC_CTXT_GLU_CARB_SNACK(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_CTXT_GLU_CARB_SNACK get() {
    return _instance;
  }
}
