
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_HF_INST extends MdcNomenclatureValue {

  private static final MDC_HF_INST _instance = new MDC_HF_INST("MDC_HF_INST", 2018, 129);

  private MDC_HF_INST(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_HF_INST get() {
    return _instance;
  }
}
