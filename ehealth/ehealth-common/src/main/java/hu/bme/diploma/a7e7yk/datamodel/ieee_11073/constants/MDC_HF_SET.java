
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_HF_SET extends MdcNomenclatureValue {

  private static final MDC_HF_SET _instance = new MDC_HF_SET("MDC_HF_SET", 200, 129);

  private MDC_HF_SET(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_HF_SET get() {
    return _instance;
  }
}
