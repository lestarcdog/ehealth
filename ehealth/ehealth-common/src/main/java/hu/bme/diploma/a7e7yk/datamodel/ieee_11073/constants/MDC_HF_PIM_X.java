
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_HF_PIM_X extends MdcNomenclatureValue {

  private static final MDC_HF_PIM_X _instance = new MDC_HF_PIM_X("MDC_HF_PIM_X", 2006, 129);

  private MDC_HF_PIM_X(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_HF_PIM_X get() {
    return _instance;
  }
}
