
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_ECG_EVT_CTXT_GEN extends MdcNomenclatureValue {

  private static final MDC_ECG_EVT_CTXT_GEN _instance = new MDC_ECG_EVT_CTXT_GEN("MDC_ECG_EVT_CTXT_GEN", 21977, 128);

  private MDC_ECG_EVT_CTXT_GEN(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_ECG_EVT_CTXT_GEN get() {
    return _instance;
  }
}
