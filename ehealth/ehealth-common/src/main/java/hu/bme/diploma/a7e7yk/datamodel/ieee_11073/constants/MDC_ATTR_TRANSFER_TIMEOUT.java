
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_ATTR_TRANSFER_TIMEOUT extends MdcNomenclatureValue {

  private static final MDC_ATTR_TRANSFER_TIMEOUT _instance = new MDC_ATTR_TRANSFER_TIMEOUT("MDC_ATTR_TRANSFER_TIMEOUT", 2660, 1);

  private MDC_ATTR_TRANSFER_TIMEOUT(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_ATTR_TRANSFER_TIMEOUT get() {
    return _instance;
  }
}
