
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_ECG_HEART_RATE extends MdcNomenclatureValue {

  private static final MDC_ECG_HEART_RATE _instance = new MDC_ECG_HEART_RATE("MDC_ECG_HEART_RATE", 16770, 2);

  private MDC_ECG_HEART_RATE(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_ECG_HEART_RATE get() {
    return _instance;
  }
}
