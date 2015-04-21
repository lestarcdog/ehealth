
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_NECK_MYLOHYOID extends MdcNomenclatureValue {

  private static final MDC_MUSC_NECK_MYLOHYOID _instance = new MDC_MUSC_NECK_MYLOHYOID("MDC_MUSC_NECK_MYLOHYOID", 416, 7);

  private MDC_MUSC_NECK_MYLOHYOID(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_NECK_MYLOHYOID get() {
    return _instance;
  }
}
