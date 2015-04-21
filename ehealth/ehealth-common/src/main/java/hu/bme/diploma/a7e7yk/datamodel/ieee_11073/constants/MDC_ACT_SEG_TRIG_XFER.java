
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_ACT_SEG_TRIG_XFER extends MdcNomenclatureValue {

  private static final MDC_ACT_SEG_TRIG_XFER _instance = new MDC_ACT_SEG_TRIG_XFER("MDC_ACT_SEG_TRIG_XFER", 3100, 1);

  private MDC_ACT_SEG_TRIG_XFER(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_ACT_SEG_TRIG_XFER get() {
    return _instance;
  }
}
