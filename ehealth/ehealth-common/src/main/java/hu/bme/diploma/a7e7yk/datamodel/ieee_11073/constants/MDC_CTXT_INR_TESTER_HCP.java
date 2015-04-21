
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_CTXT_INR_TESTER_HCP extends MdcNomenclatureValue {

  private static final MDC_CTXT_INR_TESTER_HCP _instance = new MDC_CTXT_INR_TESTER_HCP("MDC_CTXT_INR_TESTER_HCP", 29318, 128);

  private MDC_CTXT_INR_TESTER_HCP(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_CTXT_INR_TESTER_HCP get() {
    return _instance;
  }
}
