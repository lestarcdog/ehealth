
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_ECG_EVT_CTXT_EXTERNAL extends MdcNomenclatureValue {

  private static final MDC_ECG_EVT_CTXT_EXTERNAL _instance = new MDC_ECG_EVT_CTXT_EXTERNAL("MDC_ECG_EVT_CTXT_EXTERNAL", 21981, 128);

  private MDC_ECG_EVT_CTXT_EXTERNAL(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_ECG_EVT_CTXT_EXTERNAL get() {
    return _instance;
  }
}
