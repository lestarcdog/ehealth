
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_CTXT_GLU_HEALTH_MENSES extends MdcNomenclatureValue {

  private static final MDC_CTXT_GLU_HEALTH_MENSES _instance = new MDC_CTXT_GLU_HEALTH_MENSES("MDC_CTXT_GLU_HEALTH_MENSES", 29224, 128);

  private MDC_CTXT_GLU_HEALTH_MENSES(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_CTXT_GLU_HEALTH_MENSES get() {
    return _instance;
  }
}
