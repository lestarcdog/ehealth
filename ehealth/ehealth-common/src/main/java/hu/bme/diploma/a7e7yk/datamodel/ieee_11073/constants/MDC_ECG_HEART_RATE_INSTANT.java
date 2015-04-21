
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_ECG_HEART_RATE_INSTANT extends MdcNomenclatureValue {

  private static final MDC_ECG_HEART_RATE_INSTANT _instance = new MDC_ECG_HEART_RATE_INSTANT("MDC_ECG_HEART_RATE_INSTANT", 21982, 128);

  private MDC_ECG_HEART_RATE_INSTANT(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_ECG_HEART_RATE_INSTANT get() {
    return _instance;
  }
}
