
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_TRUNK extends MdcNomenclatureValue {

  private static final MDC_MUSC_TRUNK _instance = new MDC_MUSC_TRUNK("MDC_MUSC_TRUNK", 420, 7);

  private MDC_MUSC_TRUNK(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_TRUNK get() {
    return _instance;
  }
}
