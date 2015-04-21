
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_CTXT_GLU_MEAL extends MdcNomenclatureValue {

  private static final MDC_CTXT_GLU_MEAL _instance = new MDC_CTXT_GLU_MEAL("MDC_CTXT_GLU_MEAL", 29256, 128);

  private MDC_CTXT_GLU_MEAL(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_CTXT_GLU_MEAL get() {
    return _instance;
  }
}
