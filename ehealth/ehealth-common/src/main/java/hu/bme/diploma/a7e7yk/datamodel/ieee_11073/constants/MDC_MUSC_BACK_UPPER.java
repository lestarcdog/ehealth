
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_BACK_UPPER extends MdcNomenclatureValue {

  private static final MDC_MUSC_BACK_UPPER _instance = new MDC_MUSC_BACK_UPPER("MDC_MUSC_BACK_UPPER", 428, 7);

  private MDC_MUSC_BACK_UPPER(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_BACK_UPPER get() {
    return _instance;
  }
}
