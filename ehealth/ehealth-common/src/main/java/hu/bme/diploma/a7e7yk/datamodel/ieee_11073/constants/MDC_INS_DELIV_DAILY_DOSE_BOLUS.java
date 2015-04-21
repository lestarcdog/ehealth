
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_INS_DELIV_DAILY_DOSE_BOLUS extends MdcNomenclatureValue {

  private static final MDC_INS_DELIV_DAILY_DOSE_BOLUS _instance = new MDC_INS_DELIV_DAILY_DOSE_BOLUS("MDC_INS_DELIV_DAILY_DOSE_BOLUS", 58400, 2);

  private MDC_INS_DELIV_DAILY_DOSE_BOLUS(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_INS_DELIV_DAILY_DOSE_BOLUS get() {
    return _instance;
  }
}
