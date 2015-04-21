
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_ECG_EVT_CTXT_DETECTED extends MdcNomenclatureValue {

  private static final MDC_ECG_EVT_CTXT_DETECTED _instance = new MDC_ECG_EVT_CTXT_DETECTED("MDC_ECG_EVT_CTXT_DETECTED", 21980, 128);

  private MDC_ECG_EVT_CTXT_DETECTED(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_ECG_EVT_CTXT_DETECTED get() {
    return _instance;
  }
}
