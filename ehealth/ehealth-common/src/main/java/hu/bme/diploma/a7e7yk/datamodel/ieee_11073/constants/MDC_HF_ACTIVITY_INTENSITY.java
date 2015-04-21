
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_HF_ACTIVITY_INTENSITY extends MdcNomenclatureValue {

  private static final MDC_HF_ACTIVITY_INTENSITY _instance = new MDC_HF_ACTIVITY_INTENSITY("MDC_HF_ACTIVITY_INTENSITY", 127, 129);

  private MDC_HF_ACTIVITY_INTENSITY(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_HF_ACTIVITY_INTENSITY get() {
    return _instance;
  }
}
