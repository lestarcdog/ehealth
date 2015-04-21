
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_TIME_SYNC_CDMA extends MdcNomenclatureValue {

  private static final MDC_TIME_SYNC_CDMA _instance = new MDC_TIME_SYNC_CDMA("MDC_TIME_SYNC_CDMA", 7944, 8);

  private MDC_TIME_SYNC_CDMA(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_TIME_SYNC_CDMA get() {
    return _instance;
  }
}
