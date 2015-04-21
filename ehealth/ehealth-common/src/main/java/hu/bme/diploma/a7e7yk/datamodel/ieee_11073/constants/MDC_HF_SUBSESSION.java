
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_HF_SUBSESSION extends MdcNomenclatureValue {

  private static final MDC_HF_SUBSESSION _instance = new MDC_HF_SUBSESSION("MDC_HF_SUBSESSION", 124, 129);

  private MDC_HF_SUBSESSION(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_HF_SUBSESSION get() {
    return _instance;
  }
}
