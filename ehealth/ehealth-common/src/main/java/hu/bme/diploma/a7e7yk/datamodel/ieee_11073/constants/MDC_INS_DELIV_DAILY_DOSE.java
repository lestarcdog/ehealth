
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_INS_DELIV_DAILY_DOSE extends MdcNomenclatureValue {

  private static final MDC_INS_DELIV_DAILY_DOSE _instance = new MDC_INS_DELIV_DAILY_DOSE("MDC_INS_DELIV_DAILY_DOSE", 58388, 2);

  private MDC_INS_DELIV_DAILY_DOSE(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_INS_DELIV_DAILY_DOSE get() {
    return _instance;
  }
}
