
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_ATTR_TX_WIND extends MdcNomenclatureValue {

  private static final MDC_ATTR_TX_WIND _instance = new MDC_ATTR_TX_WIND("MDC_ATTR_TX_WIND", 2453, 1);

  private MDC_ATTR_TX_WIND(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_ATTR_TX_WIND get() {
    return _instance;
  }
}
