
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_HF_PIM extends MdcNomenclatureValue {

  private static final MDC_HF_PIM _instance = new MDC_HF_PIM("MDC_HF_PIM", 2005, 129);

  private MDC_HF_PIM(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_HF_PIM get() {
    return _instance;
  }
}
