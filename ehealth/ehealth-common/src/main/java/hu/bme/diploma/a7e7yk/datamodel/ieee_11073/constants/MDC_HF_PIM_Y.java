
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_HF_PIM_Y extends MdcNomenclatureValue {

  private static final MDC_HF_PIM_Y _instance = new MDC_HF_PIM_Y("MDC_HF_PIM_Y", 2007, 129);

  private MDC_HF_PIM_Y(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_HF_PIM_Y get() {
    return _instance;
  }
}
