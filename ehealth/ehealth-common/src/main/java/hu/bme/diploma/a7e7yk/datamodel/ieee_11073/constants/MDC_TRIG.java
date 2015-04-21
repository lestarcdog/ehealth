
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_TRIG extends MdcNomenclatureValue {

  private static final MDC_TRIG _instance = new MDC_TRIG("MDC_TRIG", 53250, 2);

  private MDC_TRIG(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_TRIG get() {
    return _instance;
  }
}
