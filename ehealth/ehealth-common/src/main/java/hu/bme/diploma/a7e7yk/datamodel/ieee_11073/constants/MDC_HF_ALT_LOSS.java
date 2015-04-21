
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_HF_ALT_LOSS extends MdcNomenclatureValue {

  private static final MDC_HF_ALT_LOSS _instance = new MDC_HF_ALT_LOSS("MDC_HF_ALT_LOSS", 101, 129);

  private MDC_HF_ALT_LOSS(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_HF_ALT_LOSS get() {
    return _instance;
  }
}
