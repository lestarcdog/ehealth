
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_CTXT_GLU_CARB_SUPPER extends MdcNomenclatureValue {

  private static final MDC_CTXT_GLU_CARB_SUPPER _instance = new MDC_CTXT_GLU_CARB_SUPPER("MDC_CTXT_GLU_CARB_SUPPER", 29180, 128);

  private MDC_CTXT_GLU_CARB_SUPPER(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_CTXT_GLU_CARB_SUPPER get() {
    return _instance;
  }
}
