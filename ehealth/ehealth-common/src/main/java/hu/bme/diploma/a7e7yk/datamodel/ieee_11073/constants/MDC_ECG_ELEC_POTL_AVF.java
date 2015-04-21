
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_ECG_ELEC_POTL_AVF extends MdcNomenclatureValue {

  private static final MDC_ECG_ELEC_POTL_AVF _instance = new MDC_ECG_ELEC_POTL_AVF("MDC_ECG_ELEC_POTL_AVF", 320, 2);

  private MDC_ECG_ELEC_POTL_AVF(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_ECG_ELEC_POTL_AVF get() {
    return _instance;
  }
}
