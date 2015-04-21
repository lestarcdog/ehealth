
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_HF_ALT extends MdcNomenclatureValue {

  private static final MDC_HF_ALT _instance = new MDC_HF_ALT("MDC_HF_ALT", 102, 129);

  private MDC_HF_ALT(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_HF_ALT get() {
    return _instance;
  }
}
