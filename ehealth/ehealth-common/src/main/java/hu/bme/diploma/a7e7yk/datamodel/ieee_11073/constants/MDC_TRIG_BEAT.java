
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_TRIG_BEAT extends MdcNomenclatureValue {

  private static final MDC_TRIG_BEAT _instance = new MDC_TRIG_BEAT("MDC_TRIG_BEAT", 53251, 2);

  private MDC_TRIG_BEAT(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_TRIG_BEAT get() {
    return _instance;
  }
}
