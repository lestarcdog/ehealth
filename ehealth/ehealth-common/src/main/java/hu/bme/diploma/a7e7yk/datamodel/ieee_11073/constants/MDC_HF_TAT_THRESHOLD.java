
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_HF_TAT_THRESHOLD extends MdcNomenclatureValue {

  private static final MDC_HF_TAT_THRESHOLD _instance = new MDC_HF_TAT_THRESHOLD("MDC_HF_TAT_THRESHOLD", 2010, 129);

  private MDC_HF_TAT_THRESHOLD(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_HF_TAT_THRESHOLD get() {
    return _instance;
  }
}
