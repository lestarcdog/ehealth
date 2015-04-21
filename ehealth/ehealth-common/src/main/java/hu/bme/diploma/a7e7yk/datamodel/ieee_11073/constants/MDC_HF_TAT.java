
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_HF_TAT extends MdcNomenclatureValue {

  private static final MDC_HF_TAT _instance = new MDC_HF_TAT("MDC_HF_TAT", 2009, 129);

  private MDC_HF_TAT(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_HF_TAT get() {
    return _instance;
  }
}
