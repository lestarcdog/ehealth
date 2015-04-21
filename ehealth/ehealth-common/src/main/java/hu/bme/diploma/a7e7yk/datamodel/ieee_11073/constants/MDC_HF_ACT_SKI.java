
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_HF_ACT_SKI extends MdcNomenclatureValue {

  private static final MDC_HF_ACT_SKI _instance = new MDC_HF_ACT_SKI("MDC_HF_ACT_SKI", 1010, 129);

  private MDC_HF_ACT_SKI(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_HF_ACT_SKI get() {
    return _instance;
  }
}
