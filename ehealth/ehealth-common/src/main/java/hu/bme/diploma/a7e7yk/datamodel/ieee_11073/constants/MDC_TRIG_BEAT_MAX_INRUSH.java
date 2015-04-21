
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_TRIG_BEAT_MAX_INRUSH extends MdcNomenclatureValue {

  private static final MDC_TRIG_BEAT_MAX_INRUSH _instance = new MDC_TRIG_BEAT_MAX_INRUSH("MDC_TRIG_BEAT_MAX_INRUSH", 53259, 2);

  private MDC_TRIG_BEAT_MAX_INRUSH(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_TRIG_BEAT_MAX_INRUSH get() {
    return _instance;
  }
}
