
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_NOTI_CONFIG extends MdcNomenclatureValue {

  private static final MDC_NOTI_CONFIG _instance = new MDC_NOTI_CONFIG("MDC_NOTI_CONFIG", 3356, 1);

  private MDC_NOTI_CONFIG(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_NOTI_CONFIG get() {
    return _instance;
  }
}
