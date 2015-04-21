
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_CTXT_GLU_HEALTH_NONE extends MdcNomenclatureValue {

  private static final MDC_CTXT_GLU_HEALTH_NONE _instance = new MDC_CTXT_GLU_HEALTH_NONE("MDC_CTXT_GLU_HEALTH_NONE", 29232, 128);

  private MDC_CTXT_GLU_HEALTH_NONE(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_CTXT_GLU_HEALTH_NONE get() {
    return _instance;
  }
}
