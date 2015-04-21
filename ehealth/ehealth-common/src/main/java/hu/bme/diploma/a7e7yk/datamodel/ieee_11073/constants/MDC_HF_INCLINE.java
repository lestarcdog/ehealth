
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_HF_INCLINE extends MdcNomenclatureValue {

  private static final MDC_HF_INCLINE _instance = new MDC_HF_INCLINE("MDC_HF_INCLINE", 112, 129);

  private MDC_HF_INCLINE(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_HF_INCLINE get() {
    return _instance;
  }
}
