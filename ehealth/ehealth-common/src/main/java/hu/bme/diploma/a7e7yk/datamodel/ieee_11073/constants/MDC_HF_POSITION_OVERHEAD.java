
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_HF_POSITION_OVERHEAD extends MdcNomenclatureValue {

  private static final MDC_HF_POSITION_OVERHEAD _instance = new MDC_HF_POSITION_OVERHEAD("MDC_HF_POSITION_OVERHEAD", 1210, 129);

  private MDC_HF_POSITION_OVERHEAD(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_HF_POSITION_OVERHEAD get() {
    return _instance;
  }
}
