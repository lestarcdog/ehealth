
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_ECG_EVT_CTXT_PERIODIC extends MdcNomenclatureValue {

  private static final MDC_ECG_EVT_CTXT_PERIODIC _instance = new MDC_ECG_EVT_CTXT_PERIODIC("MDC_ECG_EVT_CTXT_PERIODIC", 21979, 128);

  private MDC_ECG_EVT_CTXT_PERIODIC(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_ECG_EVT_CTXT_PERIODIC get() {
    return _instance;
  }
}
