
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_CTXT_MEDICATION extends MdcNomenclatureValue {

  private static final MDC_CTXT_MEDICATION _instance = new MDC_CTXT_MEDICATION("MDC_CTXT_MEDICATION", 29188, 128);

  private MDC_CTXT_MEDICATION(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_CTXT_MEDICATION get() {
    return _instance;
  }
}
