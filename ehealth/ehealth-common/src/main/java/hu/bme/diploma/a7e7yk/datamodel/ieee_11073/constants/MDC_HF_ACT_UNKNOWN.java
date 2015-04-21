
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_HF_ACT_UNKNOWN extends MdcNomenclatureValue {

  private static final MDC_HF_ACT_UNKNOWN _instance = new MDC_HF_ACT_UNKNOWN("MDC_HF_ACT_UNKNOWN", 1007, 129);

  private MDC_HF_ACT_UNKNOWN(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_HF_ACT_UNKNOWN get() {
    return _instance;
  }
}
