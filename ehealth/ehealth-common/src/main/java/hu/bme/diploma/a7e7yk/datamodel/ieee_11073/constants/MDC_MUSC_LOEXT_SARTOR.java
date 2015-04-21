
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_LOEXT_SARTOR extends MdcNomenclatureValue {

  private static final MDC_MUSC_LOEXT_SARTOR _instance = new MDC_MUSC_LOEXT_SARTOR("MDC_MUSC_LOEXT_SARTOR", 828, 7);

  private MDC_MUSC_LOEXT_SARTOR(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_LOEXT_SARTOR get() {
    return _instance;
  }
}
