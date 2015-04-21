
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_HF_ACT_WALK extends MdcNomenclatureValue {

  private static final MDC_HF_ACT_WALK _instance = new MDC_HF_ACT_WALK("MDC_HF_ACT_WALK", 1017, 129);

  private MDC_HF_ACT_WALK(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_HF_ACT_WALK get() {
    return _instance;
  }
}
