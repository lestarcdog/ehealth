
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_BACK extends MdcNomenclatureValue {

  private static final MDC_MUSC_BACK _instance = new MDC_MUSC_BACK("MDC_MUSC_BACK", 424, 7);

  private MDC_MUSC_BACK(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_BACK get() {
    return _instance;
  }
}
