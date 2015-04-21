
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_HF_SESSION extends MdcNomenclatureValue {

  private static final MDC_HF_SESSION _instance = new MDC_HF_SESSION("MDC_HF_SESSION", 123, 129);

  private MDC_HF_SESSION(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_HF_SESSION get() {
    return _instance;
  }
}
