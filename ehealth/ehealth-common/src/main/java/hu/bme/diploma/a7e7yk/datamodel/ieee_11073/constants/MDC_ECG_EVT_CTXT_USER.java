
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_ECG_EVT_CTXT_USER extends MdcNomenclatureValue {

  private static final MDC_ECG_EVT_CTXT_USER _instance = new MDC_ECG_EVT_CTXT_USER("MDC_ECG_EVT_CTXT_USER", 21978, 128);

  private MDC_ECG_EVT_CTXT_USER(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_ECG_EVT_CTXT_USER get() {
    return _instance;
  }
}
