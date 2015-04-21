
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_ATTR_CONTEXT_KEY extends MdcNomenclatureValue {

  private static final MDC_ATTR_CONTEXT_KEY _instance = new MDC_ATTR_CONTEXT_KEY("MDC_ATTR_CONTEXT_KEY", 2680, 1);

  private MDC_ATTR_CONTEXT_KEY(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_ATTR_CONTEXT_KEY get() {
    return _instance;
  }
}
