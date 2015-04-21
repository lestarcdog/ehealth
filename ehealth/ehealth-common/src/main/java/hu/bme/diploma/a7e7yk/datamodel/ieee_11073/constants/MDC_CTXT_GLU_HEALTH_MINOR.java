
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_CTXT_GLU_HEALTH_MINOR extends MdcNomenclatureValue {

  private static final MDC_CTXT_GLU_HEALTH_MINOR _instance = new MDC_CTXT_GLU_HEALTH_MINOR("MDC_CTXT_GLU_HEALTH_MINOR", 29216, 128);

  private MDC_CTXT_GLU_HEALTH_MINOR(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_CTXT_GLU_HEALTH_MINOR get() {
    return _instance;
  }
}
