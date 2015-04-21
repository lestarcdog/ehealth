
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_HF_ACT_MONITOR extends MdcNomenclatureValue {

  private static final MDC_HF_ACT_MONITOR _instance = new MDC_HF_ACT_MONITOR("MDC_HF_ACT_MONITOR", 1009, 129);

  private MDC_HF_ACT_MONITOR(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_HF_ACT_MONITOR get() {
    return _instance;
  }
}
