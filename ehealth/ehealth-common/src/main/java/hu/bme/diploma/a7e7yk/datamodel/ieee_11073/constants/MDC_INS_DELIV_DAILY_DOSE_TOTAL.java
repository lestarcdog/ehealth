
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_INS_DELIV_DAILY_DOSE_TOTAL extends MdcNomenclatureValue {

  private static final MDC_INS_DELIV_DAILY_DOSE_TOTAL _instance = new MDC_INS_DELIV_DAILY_DOSE_TOTAL("MDC_INS_DELIV_DAILY_DOSE_TOTAL", 58392, 2);

  private MDC_INS_DELIV_DAILY_DOSE_TOTAL(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_INS_DELIV_DAILY_DOSE_TOTAL get() {
    return _instance;
  }
}
