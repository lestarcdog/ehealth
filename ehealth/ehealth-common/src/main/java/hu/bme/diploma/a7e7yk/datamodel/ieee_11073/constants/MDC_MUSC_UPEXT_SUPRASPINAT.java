
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_UPEXT_SUPRASPINAT extends MdcNomenclatureValue {

  private static final MDC_MUSC_UPEXT_SUPRASPINAT _instance = new MDC_MUSC_UPEXT_SUPRASPINAT("MDC_MUSC_UPEXT_SUPRASPINAT", 608, 7);

  private MDC_MUSC_UPEXT_SUPRASPINAT(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_UPEXT_SUPRASPINAT get() {
    return _instance;
  }
}
