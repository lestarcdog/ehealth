
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_BACK_LASTISSIM_DORS extends MdcNomenclatureValue {

  private static final MDC_MUSC_BACK_LASTISSIM_DORS _instance = new MDC_MUSC_BACK_LASTISSIM_DORS("MDC_MUSC_BACK_LASTISSIM_DORS", 440, 7);

  private MDC_MUSC_BACK_LASTISSIM_DORS(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_BACK_LASTISSIM_DORS get() {
    return _instance;
  }
}
