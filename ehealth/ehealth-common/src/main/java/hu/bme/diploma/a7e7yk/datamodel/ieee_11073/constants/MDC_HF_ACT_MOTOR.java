
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_HF_ACT_MOTOR extends MdcNomenclatureValue {

  private static final MDC_HF_ACT_MOTOR _instance = new MDC_HF_ACT_MOTOR("MDC_HF_ACT_MOTOR", 1002, 129);

  private MDC_HF_ACT_MOTOR(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_HF_ACT_MOTOR get() {
    return _instance;
  }
}
