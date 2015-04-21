
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_THORAX_INTERCOSTAL extends MdcNomenclatureValue {

  private static final MDC_MUSC_THORAX_INTERCOSTAL _instance = new MDC_MUSC_THORAX_INTERCOSTAL("MDC_MUSC_THORAX_INTERCOSTAL", 548, 7);

  private MDC_MUSC_THORAX_INTERCOSTAL(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_THORAX_INTERCOSTAL get() {
    return _instance;
  }
}
