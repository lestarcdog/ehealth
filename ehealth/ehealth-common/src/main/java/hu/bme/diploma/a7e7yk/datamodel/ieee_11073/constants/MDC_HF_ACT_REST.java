
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_HF_ACT_REST extends MdcNomenclatureValue {

  private static final MDC_HF_ACT_REST _instance = new MDC_HF_ACT_REST("MDC_HF_ACT_REST", 1001, 129);

  private MDC_HF_ACT_REST(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_HF_ACT_REST get() {
    return _instance;
  }
}
