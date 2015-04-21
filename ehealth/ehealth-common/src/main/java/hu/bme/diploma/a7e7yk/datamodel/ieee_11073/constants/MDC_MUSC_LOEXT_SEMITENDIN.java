
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_LOEXT_SEMITENDIN extends MdcNomenclatureValue {

  private static final MDC_MUSC_LOEXT_SEMITENDIN _instance = new MDC_MUSC_LOEXT_SEMITENDIN("MDC_MUSC_LOEXT_SEMITENDIN", 884, 7);

  private MDC_MUSC_LOEXT_SEMITENDIN(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_LOEXT_SEMITENDIN get() {
    return _instance;
  }
}
