
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_HF_POSITION_STANDING extends MdcNomenclatureValue {

  private static final MDC_HF_POSITION_STANDING _instance = new MDC_HF_POSITION_STANDING("MDC_HF_POSITION_STANDING", 1206, 129);

  private MDC_HF_POSITION_STANDING(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_HF_POSITION_STANDING get() {
    return _instance;
  }
}
