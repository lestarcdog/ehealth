
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_BACK_RHOMB_MINOR extends MdcNomenclatureValue {

  private static final MDC_MUSC_BACK_RHOMB_MINOR _instance = new MDC_MUSC_BACK_RHOMB_MINOR("MDC_MUSC_BACK_RHOMB_MINOR", 448, 7);

  private MDC_MUSC_BACK_RHOMB_MINOR(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_BACK_RHOMB_MINOR get() {
    return _instance;
  }
}
