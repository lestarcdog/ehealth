
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_CTXT_GLU_TESTER_LAB extends MdcNomenclatureValue {

  private static final MDC_CTXT_GLU_TESTER_LAB _instance = new MDC_CTXT_GLU_TESTER_LAB("MDC_CTXT_GLU_TESTER_LAB", 29288, 128);

  private MDC_CTXT_GLU_TESTER_LAB(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_CTXT_GLU_TESTER_LAB get() {
    return _instance;
  }
}
