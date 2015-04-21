
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_PULS_OXIM_DEV_STATUS extends MdcNomenclatureValue {

  private static final MDC_PULS_OXIM_DEV_STATUS _instance = new MDC_PULS_OXIM_DEV_STATUS("MDC_PULS_OXIM_DEV_STATUS", 19532, 2);

  private MDC_PULS_OXIM_DEV_STATUS(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_PULS_OXIM_DEV_STATUS get() {
    return _instance;
  }
}
