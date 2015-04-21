
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_LOEXT_VAST_MED extends MdcNomenclatureValue {

  private static final MDC_MUSC_LOEXT_VAST_MED _instance = new MDC_MUSC_LOEXT_VAST_MED("MDC_MUSC_LOEXT_VAST_MED", 848, 7);

  private MDC_MUSC_LOEXT_VAST_MED(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_LOEXT_VAST_MED get() {
    return _instance;
  }
}
