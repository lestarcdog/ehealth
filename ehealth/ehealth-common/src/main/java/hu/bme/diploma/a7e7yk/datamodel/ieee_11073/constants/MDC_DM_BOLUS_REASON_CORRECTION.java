
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_DM_BOLUS_REASON_CORRECTION extends MdcNomenclatureValue {

  private static final MDC_DM_BOLUS_REASON_CORRECTION _instance = new MDC_DM_BOLUS_REASON_CORRECTION("MDC_DM_BOLUS_REASON_CORRECTION", 29713, 128);

  private MDC_DM_BOLUS_REASON_CORRECTION(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_DM_BOLUS_REASON_CORRECTION get() {
    return _instance;
  }
}
