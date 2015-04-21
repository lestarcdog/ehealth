
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_INS_DELIV_BOLUS_SLOW extends MdcNomenclatureValue {

  private static final MDC_INS_DELIV_BOLUS_SLOW _instance = new MDC_INS_DELIV_BOLUS_SLOW("MDC_INS_DELIV_BOLUS_SLOW", 58384, 2);

  private MDC_INS_DELIV_BOLUS_SLOW(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_INS_DELIV_BOLUS_SLOW get() {
    return _instance;
  }
}
