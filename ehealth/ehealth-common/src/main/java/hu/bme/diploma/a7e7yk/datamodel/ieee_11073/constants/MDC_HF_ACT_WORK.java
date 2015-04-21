
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_HF_ACT_WORK extends MdcNomenclatureValue {

  private static final MDC_HF_ACT_WORK _instance = new MDC_HF_ACT_WORK("MDC_HF_ACT_WORK", 1016, 129);

  private MDC_HF_ACT_WORK(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_HF_ACT_WORK get() {
    return _instance;
  }
}
