
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_ACT_SET_TIME extends MdcNomenclatureValue {

  private static final MDC_ACT_SET_TIME _instance = new MDC_ACT_SET_TIME("MDC_ACT_SET_TIME", 3095, 1);

  private MDC_ACT_SET_TIME(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_ACT_SET_TIME get() {
    return _instance;
  }
}
