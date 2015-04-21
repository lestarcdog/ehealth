
  package hu.bme.diploma.a7e7yk.datamodel.ieee_11073.constants;

import hu.bme.diploma.a7e7yk.datamodel.ieee_11073.MdcNomenclatureValue;

public class MDC_ECG_ELEC_POTL_AVR extends MdcNomenclatureValue {

  private static final MDC_ECG_ELEC_POTL_AVR _instance = new MDC_ECG_ELEC_POTL_AVR("MDC_ECG_ELEC_POTL_AVR", 318, 2);

  private MDC_ECG_ELEC_POTL_AVR(String name, int value, int parentValue) {
    super(name, value, parentValue);
  }

  public static MDC_ECG_ELEC_POTL_AVR get() {
    return _instance;
  }
}
