
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_HF_POSITION_BENTOVER extends MdcNomenclatureValue {

  private static final MDC_HF_POSITION_BENTOVER _instance = new MDC_HF_POSITION_BENTOVER("MDC_HF_POSITION_BENTOVER", 1208, 129);

  private MDC_HF_POSITION_BENTOVER(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_HF_POSITION_BENTOVER get() {
    return _instance;
  }
}
