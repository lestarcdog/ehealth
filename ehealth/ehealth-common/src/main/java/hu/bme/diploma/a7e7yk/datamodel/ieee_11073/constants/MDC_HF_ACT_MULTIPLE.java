
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_HF_ACT_MULTIPLE extends MdcNomenclatureValue {

  private static final MDC_HF_ACT_MULTIPLE _instance = new MDC_HF_ACT_MULTIPLE("MDC_HF_ACT_MULTIPLE", 1008, 129);

  private MDC_HF_ACT_MULTIPLE(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_HF_ACT_MULTIPLE get() {
    return _instance;
  }
}
