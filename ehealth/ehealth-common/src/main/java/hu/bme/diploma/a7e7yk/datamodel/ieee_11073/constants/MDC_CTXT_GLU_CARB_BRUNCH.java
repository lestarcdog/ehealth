
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_CTXT_GLU_CARB_BRUNCH extends MdcNomenclatureValue {

  private static final MDC_CTXT_GLU_CARB_BRUNCH _instance = new MDC_CTXT_GLU_CARB_BRUNCH("MDC_CTXT_GLU_CARB_BRUNCH", 29184, 128);

  private MDC_CTXT_GLU_CARB_BRUNCH(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_CTXT_GLU_CARB_BRUNCH get() {
    return _instance;
  }
}
