
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_HF_MEAN_NULL_EXCLUDE extends MdcNomenclatureValue {

  private static final MDC_HF_MEAN_NULL_EXCLUDE _instance = new MDC_HF_MEAN_NULL_EXCLUDE("MDC_HF_MEAN_NULL_EXCLUDE", 2001, 129);

  private MDC_HF_MEAN_NULL_EXCLUDE(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_HF_MEAN_NULL_EXCLUDE get() {
    return _instance;
  }
}
