
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_HF_ACT_BIKE extends MdcNomenclatureValue {

  private static final MDC_HF_ACT_BIKE _instance = new MDC_HF_ACT_BIKE("MDC_HF_ACT_BIKE", 1012, 129);

  private MDC_HF_ACT_BIKE(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_HF_ACT_BIKE get() {
    return _instance;
  }
}
