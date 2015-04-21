
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_HF_ACT_SUS_PHYS extends MdcNomenclatureValue {

  private static final MDC_HF_ACT_SUS_PHYS _instance = new MDC_HF_ACT_SUS_PHYS("MDC_HF_ACT_SUS_PHYS", 1006, 129);

  private MDC_HF_ACT_SUS_PHYS(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_HF_ACT_SUS_PHYS get() {
    return _instance;
  }
}
