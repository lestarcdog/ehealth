
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_THORAX_PECTORAL_MINOR extends MdcNomenclatureValue {

  private static final MDC_MUSC_THORAX_PECTORAL_MINOR _instance = new MDC_MUSC_THORAX_PECTORAL_MINOR("MDC_MUSC_THORAX_PECTORAL_MINOR", 536, 7);

  private MDC_MUSC_THORAX_PECTORAL_MINOR(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_THORAX_PECTORAL_MINOR get() {
    return _instance;
  }
}
