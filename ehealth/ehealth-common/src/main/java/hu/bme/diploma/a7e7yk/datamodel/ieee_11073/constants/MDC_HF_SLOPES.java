
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_HF_SLOPES extends MdcNomenclatureValue {

  private static final MDC_HF_SLOPES _instance = new MDC_HF_SLOPES("MDC_HF_SLOPES", 109, 129);

  private MDC_HF_SLOPES(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_HF_SLOPES get() {
    return _instance;
  }
}
