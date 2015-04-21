
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_TIME_SYNC_USB_SOF extends MdcNomenclatureValue {

  private static final MDC_TIME_SYNC_USB_SOF _instance = new MDC_TIME_SYNC_USB_SOF("MDC_TIME_SYNC_USB_SOF", 7947, 8);

  private MDC_TIME_SYNC_USB_SOF(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_TIME_SYNC_USB_SOF get() {
    return _instance;
  }
}
