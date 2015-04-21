
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_HF_ACTIVITY_TIME extends MdcNomenclatureValue {

  private static final MDC_HF_ACTIVITY_TIME _instance = new MDC_HF_ACTIVITY_TIME("MDC_HF_ACTIVITY_TIME", 125, 129);

  private MDC_HF_ACTIVITY_TIME(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_HF_ACTIVITY_TIME get() {
    return _instance;
  }
}
