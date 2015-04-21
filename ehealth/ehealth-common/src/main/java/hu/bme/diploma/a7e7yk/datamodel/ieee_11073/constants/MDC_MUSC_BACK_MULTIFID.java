
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_MUSC_BACK_MULTIFID extends MdcNomenclatureValue {

  private static final MDC_MUSC_BACK_MULTIFID _instance = new MDC_MUSC_BACK_MULTIFID("MDC_MUSC_BACK_MULTIFID", 508, 7);

  private MDC_MUSC_BACK_MULTIFID(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_MUSC_BACK_MULTIFID get() {
    return _instance;
  }
}
