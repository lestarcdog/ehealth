
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_HF_ACT_PHYS extends MdcNomenclatureValue {

  private static final MDC_HF_ACT_PHYS _instance = new MDC_HF_ACT_PHYS("MDC_HF_ACT_PHYS", 1005, 129);

  private MDC_HF_ACT_PHYS(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_HF_ACT_PHYS get() {
    return _instance;
  }
}
