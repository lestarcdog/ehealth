
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_HF_ACT_SLEEP extends MdcNomenclatureValue {

  private static final MDC_HF_ACT_SLEEP _instance = new MDC_HF_ACT_SLEEP("MDC_HF_ACT_SLEEP", 1004, 129);

  private MDC_HF_ACT_SLEEP(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_HF_ACT_SLEEP get() {
    return _instance;
  }
}
