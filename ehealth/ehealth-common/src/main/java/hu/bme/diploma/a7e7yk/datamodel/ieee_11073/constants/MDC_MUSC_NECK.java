
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_NECK extends MdcNomenclatureValue {

  private static final MDC_MUSC_NECK _instance = new MDC_MUSC_NECK("MDC_MUSC_NECK", 388, 7);

  private MDC_MUSC_NECK(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_NECK get() {
    return _instance;
  }
}
