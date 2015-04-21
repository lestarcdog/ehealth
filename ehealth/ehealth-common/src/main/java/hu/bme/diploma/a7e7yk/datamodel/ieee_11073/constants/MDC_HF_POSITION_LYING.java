
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_HF_POSITION_LYING extends MdcNomenclatureValue {

  private static final MDC_HF_POSITION_LYING _instance = new MDC_HF_POSITION_LYING("MDC_HF_POSITION_LYING", 1211, 129);

  private MDC_HF_POSITION_LYING(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_HF_POSITION_LYING get() {
    return _instance;
  }
}
