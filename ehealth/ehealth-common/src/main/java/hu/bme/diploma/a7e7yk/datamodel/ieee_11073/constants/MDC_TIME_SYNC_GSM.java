
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_TIME_SYNC_GSM extends MdcNomenclatureValue {

  private static final MDC_TIME_SYNC_GSM _instance = new MDC_TIME_SYNC_GSM("MDC_TIME_SYNC_GSM", 7945, 8);

  private MDC_TIME_SYNC_GSM(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_TIME_SYNC_GSM get() {
    return _instance;
  }
}
