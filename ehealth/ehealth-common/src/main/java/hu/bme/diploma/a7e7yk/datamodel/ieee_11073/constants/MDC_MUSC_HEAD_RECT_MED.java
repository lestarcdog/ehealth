
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_HEAD_RECT_MED extends MdcNomenclatureValue {

  private static final MDC_MUSC_HEAD_RECT_MED _instance = new MDC_MUSC_HEAD_RECT_MED("MDC_MUSC_HEAD_RECT_MED", 268, 7);

  private MDC_MUSC_HEAD_RECT_MED(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_HEAD_RECT_MED get() {
    return _instance;
  }
}
