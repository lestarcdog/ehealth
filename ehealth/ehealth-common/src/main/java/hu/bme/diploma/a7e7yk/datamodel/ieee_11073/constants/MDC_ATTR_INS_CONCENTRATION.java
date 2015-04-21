
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_ATTR_INS_CONCENTRATION extends MdcNomenclatureValue {

  private static final MDC_ATTR_INS_CONCENTRATION _instance = new MDC_ATTR_INS_CONCENTRATION("MDC_ATTR_INS_CONCENTRATION", 2681, 1);

  private MDC_ATTR_INS_CONCENTRATION(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_ATTR_INS_CONCENTRATION get() {
    return _instance;
  }
}
