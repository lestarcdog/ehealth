
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_HF_ACT_RUN extends MdcNomenclatureValue {

  private static final MDC_HF_ACT_RUN _instance = new MDC_HF_ACT_RUN("MDC_HF_ACT_RUN", 1011, 129);

  private MDC_HF_ACT_RUN(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_HF_ACT_RUN get() {
    return _instance;
  }
}
