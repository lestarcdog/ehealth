
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_ATTR_SUPPLEMENTAL_TYPES extends MdcNomenclatureValue {

  private static final MDC_ATTR_SUPPLEMENTAL_TYPES _instance = new MDC_ATTR_SUPPLEMENTAL_TYPES("MDC_ATTR_SUPPLEMENTAL_TYPES", 2657, 1);

  private MDC_ATTR_SUPPLEMENTAL_TYPES(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_ATTR_SUPPLEMENTAL_TYPES get() {
    return _instance;
  }
}
