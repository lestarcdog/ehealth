
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_CTXT_GLU_HEALTH_STRESS extends MdcNomenclatureValue {

  private static final MDC_CTXT_GLU_HEALTH_STRESS _instance = new MDC_CTXT_GLU_HEALTH_STRESS("MDC_CTXT_GLU_HEALTH_STRESS", 29228, 128);

  private MDC_CTXT_GLU_HEALTH_STRESS(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_CTXT_GLU_HEALTH_STRESS get() {
    return _instance;
  }
}
