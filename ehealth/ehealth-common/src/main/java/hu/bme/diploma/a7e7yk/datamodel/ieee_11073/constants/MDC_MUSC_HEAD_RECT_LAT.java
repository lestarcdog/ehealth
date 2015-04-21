
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_HEAD_RECT_LAT extends MdcNomenclatureValue {

  private static final MDC_MUSC_HEAD_RECT_LAT _instance = new MDC_MUSC_HEAD_RECT_LAT("MDC_MUSC_HEAD_RECT_LAT", 272, 7);

  private MDC_MUSC_HEAD_RECT_LAT(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_HEAD_RECT_LAT get() {
    return _instance;
  }
}
