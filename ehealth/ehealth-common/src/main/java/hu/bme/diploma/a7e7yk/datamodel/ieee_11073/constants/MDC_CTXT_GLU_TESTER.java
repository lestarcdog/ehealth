
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_CTXT_GLU_TESTER extends MdcNomenclatureValue {

  private static final MDC_CTXT_GLU_TESTER _instance = new MDC_CTXT_GLU_TESTER("MDC_CTXT_GLU_TESTER", 29276, 128);

  private MDC_CTXT_GLU_TESTER(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_CTXT_GLU_TESTER get() {
    return _instance;
  }
}
