
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_HF_ACT_HOME extends MdcNomenclatureValue {

  private static final MDC_HF_ACT_HOME _instance = new MDC_HF_ACT_HOME("MDC_HF_ACT_HOME", 1015, 129);

  private MDC_HF_ACT_HOME(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_HF_ACT_HOME get() {
    return _instance;
  }
}
