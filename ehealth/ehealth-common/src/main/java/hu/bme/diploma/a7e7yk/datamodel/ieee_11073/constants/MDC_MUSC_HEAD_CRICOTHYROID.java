
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_HEAD_CRICOTHYROID extends MdcNomenclatureValue {

  private static final MDC_MUSC_HEAD_CRICOTHYROID _instance = new MDC_MUSC_HEAD_CRICOTHYROID("MDC_MUSC_HEAD_CRICOTHYROID", 380, 7);

  private MDC_MUSC_HEAD_CRICOTHYROID(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_HEAD_CRICOTHYROID get() {
    return _instance;
  }
}
