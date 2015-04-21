
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_CTXT_GLU_EXERCISE extends MdcNomenclatureValue {

  private static final MDC_CTXT_GLU_EXERCISE _instance = new MDC_CTXT_GLU_EXERCISE("MDC_CTXT_GLU_EXERCISE", 29152, 128);

  private MDC_CTXT_GLU_EXERCISE(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_CTXT_GLU_EXERCISE get() {
    return _instance;
  }
}
