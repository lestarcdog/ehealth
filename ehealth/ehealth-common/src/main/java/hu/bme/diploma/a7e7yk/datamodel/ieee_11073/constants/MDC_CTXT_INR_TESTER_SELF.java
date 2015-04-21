
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_CTXT_INR_TESTER_SELF extends MdcNomenclatureValue {

  private static final MDC_CTXT_INR_TESTER_SELF _instance = new MDC_CTXT_INR_TESTER_SELF("MDC_CTXT_INR_TESTER_SELF", 29317, 128);

  private MDC_CTXT_INR_TESTER_SELF(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_CTXT_INR_TESTER_SELF get() {
    return _instance;
  }
}
