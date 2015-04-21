
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_CTXT_GLU_CARB extends MdcNomenclatureValue {

  private static final MDC_CTXT_GLU_CARB _instance = new MDC_CTXT_GLU_CARB("MDC_CTXT_GLU_CARB", 29156, 128);

  private MDC_CTXT_GLU_CARB(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_CTXT_GLU_CARB get() {
    return _instance;
  }
}
