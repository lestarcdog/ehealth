
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_INS_DELIV_BOLUS_FAST extends MdcNomenclatureValue {

  private static final MDC_INS_DELIV_BOLUS_FAST _instance = new MDC_INS_DELIV_BOLUS_FAST("MDC_INS_DELIV_BOLUS_FAST", 58380, 2);

  private MDC_INS_DELIV_BOLUS_FAST(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_INS_DELIV_BOLUS_FAST get() {
    return _instance;
  }
}
