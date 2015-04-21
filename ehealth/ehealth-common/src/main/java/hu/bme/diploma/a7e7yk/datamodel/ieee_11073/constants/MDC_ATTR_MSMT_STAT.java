
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_ATTR_MSMT_STAT extends MdcNomenclatureValue {

  private static final MDC_ATTR_MSMT_STAT _instance = new MDC_ATTR_MSMT_STAT("MDC_ATTR_MSMT_STAT", 2375, 1);

  private MDC_ATTR_MSMT_STAT(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_ATTR_MSMT_STAT get() {
    return _instance;
  }
}
