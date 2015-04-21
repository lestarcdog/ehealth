
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_THORAX_PECTORAL_MAJOR extends MdcNomenclatureValue {

  private static final MDC_MUSC_THORAX_PECTORAL_MAJOR _instance = new MDC_MUSC_THORAX_PECTORAL_MAJOR("MDC_MUSC_THORAX_PECTORAL_MAJOR", 532, 7);

  private MDC_MUSC_THORAX_PECTORAL_MAJOR(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_THORAX_PECTORAL_MAJOR get() {
    return _instance;
  }
}
