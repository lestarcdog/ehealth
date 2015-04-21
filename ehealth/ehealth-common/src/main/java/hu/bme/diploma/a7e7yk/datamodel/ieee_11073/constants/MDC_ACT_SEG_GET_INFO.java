
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_ACT_SEG_GET_INFO extends MdcNomenclatureValue {

  private static final MDC_ACT_SEG_GET_INFO _instance = new MDC_ACT_SEG_GET_INFO("MDC_ACT_SEG_GET_INFO", 3085, 1);

  private MDC_ACT_SEG_GET_INFO(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_ACT_SEG_GET_INFO get() {
    return _instance;
  }
}
