
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_HF_POSITION_HANGING extends MdcNomenclatureValue {

  private static final MDC_HF_POSITION_HANGING _instance = new MDC_HF_POSITION_HANGING("MDC_HF_POSITION_HANGING", 1209, 129);

  private MDC_HF_POSITION_HANGING(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_HF_POSITION_HANGING get() {
    return _instance;
  }
}
