
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_HF_ALT_GAIN extends MdcNomenclatureValue {

  private static final MDC_HF_ALT_GAIN _instance = new MDC_HF_ALT_GAIN("MDC_HF_ALT_GAIN", 100, 129);

  private MDC_HF_ALT_GAIN(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_HF_ALT_GAIN get() {
    return _instance;
  }
}
