
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_HF_ACT_STAIR extends MdcNomenclatureValue {

  private static final MDC_HF_ACT_STAIR _instance = new MDC_HF_ACT_STAIR("MDC_HF_ACT_STAIR", 1013, 129);

  private MDC_HF_ACT_STAIR(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_HF_ACT_STAIR get() {
    return _instance;
  }
}
