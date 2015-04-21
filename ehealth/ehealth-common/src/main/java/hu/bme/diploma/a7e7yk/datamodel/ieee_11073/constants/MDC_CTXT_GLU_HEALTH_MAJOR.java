
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_CTXT_GLU_HEALTH_MAJOR extends MdcNomenclatureValue {

  private static final MDC_CTXT_GLU_HEALTH_MAJOR _instance = new MDC_CTXT_GLU_HEALTH_MAJOR("MDC_CTXT_GLU_HEALTH_MAJOR", 29220, 128);

  private MDC_CTXT_GLU_HEALTH_MAJOR(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_CTXT_GLU_HEALTH_MAJOR get() {
    return _instance;
  }
}
