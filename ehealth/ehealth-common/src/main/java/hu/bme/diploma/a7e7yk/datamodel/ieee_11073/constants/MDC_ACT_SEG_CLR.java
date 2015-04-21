
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_ACT_SEG_CLR extends MdcNomenclatureValue {

  private static final MDC_ACT_SEG_CLR _instance = new MDC_ACT_SEG_CLR("MDC_ACT_SEG_CLR", 3084, 1);

  private MDC_ACT_SEG_CLR(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_ACT_SEG_CLR get() {
    return _instance;
  }
}
