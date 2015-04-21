
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_HF_ACT_ROW extends MdcNomenclatureValue {

  private static final MDC_HF_ACT_ROW _instance = new MDC_HF_ACT_ROW("MDC_HF_ACT_ROW", 1014, 129);

  private MDC_HF_ACT_ROW(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_HF_ACT_ROW get() {
    return _instance;
  }
}
